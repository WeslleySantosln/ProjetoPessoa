
package projetopessoa;


public class Aluno extends Pessoa{
    private int mat;
    private String Curso;

    public void cancelarMatr(){
        System.out.println("Matrícula cancelada!");

}

    public int getMat() {
        return mat;
    }

    public void setMat(int mat) {
        this.mat = mat;
    }

    public String getCurso() {
        return Curso;
    }

    public void setCurso(String Curso) {
        this.Curso = Curso;
    }

    
}
