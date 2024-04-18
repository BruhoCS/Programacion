package Ejercicio3;
public class Empregado {
    String nome;
    String dni;
    int idade;
    String departamento;
    
    Empregado(String n, String d, int i, String dep) {
        nome = n;
        dni = d;
        idade = i;
        departamento = dep;
    }
    
    @Override
    public String toString() {
        return "\t"+nome+"\t"+dni+"\t"+idade+"\t"+departamento;
    }
}
