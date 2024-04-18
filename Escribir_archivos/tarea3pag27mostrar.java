package Ejercicio3;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int useroption = 0;
		boolean salir = true;
		
		Scanner scan = new Scanner (System.in);
		
		while(salir =true) {
			
		//menu
		System.out.println("MENÚ"+"\n"+"    1. Mostrar empregados(Alfabeticamente)"+"   2.Mostrar empregados(por departamento)"
							+"\n"+"    3.Engadir empregado"+"\n"+"    4.Borrar empregado"+"\n"+"    5.Saír");
		
		
			switch(useroption) {
					//ordenar alfabeticamente empregados
			case 1:{
				ordenarEmpregados(null, null);
			}
				// ordenar por departamento
			case 2:{
				ordenarDepartamento(null, null);
			}
				//Añadir empregado
			case 3:{
				
				
			}
				//borrar empregado
			case 4:{
				
			}
				//salir
			case 5:{
				salir = false;
				System.out.println("Gracias por usar el programa:)");
				return;
				
			}
		}        	        
		  scan.close();      
		}  
		    }    
		    
			
		    public static void engadirLinha(ArrayList<Empregado> lista, String lin) {
		        String[] valores = lin.split(";");
		        lista.add(new Empregado(valores[0],valores[1],Integer.valueOf(valores[2]),
		                valores[3]));
		    }
		    
		    public static void ordenarEmpregados(ArrayList<Empregado> empregados , String linha) { 
		    	Iterator it;
		    	try (BufferedReader buffer = new BufferedReader(new FileReader("empregados.txt"))){
		            linha = buffer.readLine();
		            //Añadir lineas
		            while (linha != null) {
		                engadirLinha(empregados, linha);
		                linha = buffer.readLine();
		            }
		            System.out.println("Empregados ordenados por orde alfabética:");
		            //ordenar empleados
		            empregados.sort(new OrdeAlfabetico());
		            it = empregados.iterator();
		            while (it.hasNext()) {
		                Empregado emp = (Empregado)it.next();
		                System.out.println(emp);
		            }
		            }catch (FileNotFoundException e) {
			            System.out.println("ERRO: O ficheiro é un directorio ou ben non existe.");
			            // indicar error en caso de fallo en la lectura 
			        } catch (IOException e) {
			            System.out.println("ERRO: Ocorreu un erro na lectura do ficheiro");
			        }
		    }
		    
		    public static void ordenarDepartamento(ArrayList<Empregado> empregados , String linha) {
		    	Iterator it;
		    	try (BufferedReader buffer = new BufferedReader(new FileReader("empregados.txt"))){
		            linha = buffer.readLine();
		            //Añadir lineas
		            while (linha != null) {
		                engadirLinha(empregados, linha);
		                linha = buffer.readLine();
		            }
		           
		            //ordenar departametos
		            System.out.println("Empregados ordenados por departamento e por orde "
		                    + "alfabética :");
		            
		           
		            empregados.sort(new OrdeDepartamento());
		            it = empregados.iterator();
		            while (it.hasNext()) {
		                Empregado emp = (Empregado)it.next();
		                System.out.println(emp);
		            }
		            System.out.println("");
		            // indicar error en caso de que no exista
		        } catch (FileNotFoundException e) {
		            System.out.println("ERRO: O ficheiro é un directorio ou ben non existe.");
		            // indicar error en caso de fallo en la lectura 
		        } catch (IOException e) {
		            System.out.println("ERRO: Ocorreu un erro na lectura do ficheiro");
		        }
		    	
		    }
		  
	}
