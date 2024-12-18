package com.aluraCursos.main;

import com.aluraCursos.screenMatch.excepciones.ErrorNAException;
import com.aluraCursos.screenMatch.modelos.Titulo;
import com.aluraCursos.screenMatch.modelos.TituloOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainConBusqueda {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner leer = new Scanner(System.in);
        List<Titulo> titulos = new ArrayList<>();
        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).setPrettyPrinting().create();

        while (true){
            System.out.println("Escriba el nombre de la pelicula: ");
            var busqueda = leer.nextLine();

            if (busqueda.equalsIgnoreCase("salir")){
                break;
            }

            String direccion = "https://www.omdbapi.com/?t="+busqueda.replace(" ","+")+"&apikey=36e4bf1a";
            try{
                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder().uri(URI.create(direccion)).build();
                HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

                var json = response.body(); //resultado



                //Titulo miTitulo = gson.fromJson(json, Titulo.class);
                TituloOmdb miTituloOmdb = gson.fromJson(json, TituloOmdb.class);
                //System.out.println(miTituloOmdb);


                Titulo miTitulo = new Titulo(miTituloOmdb);
                //System.out.println(miTitulo);

                titulos.add(miTitulo);

            }catch (NumberFormatException e ){
                System.out.println(e.getMessage());
            }catch (IllegalArgumentException e){
                System.out.println("Error en la URI");
            } catch (ErrorNAException e) {
                System.out.println(e.getMessage());
            }finally {

            }
        }

        System.out.println(titulos);
        FileWriter escritura = new FileWriter("Titulos.json");
        escritura.write(gson.toJson(titulos));
        escritura.close();



    }
}
