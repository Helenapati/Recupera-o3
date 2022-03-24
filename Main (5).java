Public class Professor1{
  private String nome;
  private int cpf;

  public void SetNome (String nome)
  {
    this.nome = nome;
  }

  public void setcpf (int cpf)
  {
    this.cpf = cpf;
  }

  public String getNome ()
  {
    return this.nome;
  }

  public int cpf ()
  {
    return this.cpf;
  }

    public String toString(){
        return "\nNome: " + this.getNome() +
               "\ncpf: " + this.getcpf();
    }
}


public class departamento {
    public String Professor1;
    public String departamentomat;
    
    public String getProfessor1(){
        return Professor1;
    }

    public void setProfessor1(String setProfessor1){
        this. Professor1 = Professor1;
    
    }

    public String getdepartamentomat(){
        return departamentomat;
    }

    public void setdepartamentomat(String departamentomat){
        this. departamentomat = departamentomat;
    }

    public String toString(){
        return "\nProfessor1: " + this.getProfessor1() +
               "\ndepartamentomat: " + this.getdepartamentomat();
    }               
}




public class departamento2 {
    public String Professor1;
    public String departamentohis;
    
    public String getProfessor1(){
        return Professor1;
    }

    public void setProfessor1(String setProfessor1){
        this. Professor1 = Professor1;
    
    }

    public String getdepartamentohis(){
        return departamentohis;
    }

    public void setdepartamentomat(String departamentohis){
        this. departamentohis = departamentohis;
    }

    public String toString(){
        return "\nProfessor1: " + this.getProfessor1() +
               "\ndepartamentohis: " + this.getdepartamentohis();
    }           
}


public class Aluno{
    private String matricula; 
    private String tipoAluno; 
    private String classe; 
    
    public Aluno(String matricula, String tipoAluno, String classe, String nome, String Sobrenome, String ultimoNome, int dia, int mes, int ano, String rg){
        super(nome, Sobrenome, ultimoNome, dia, mes, ano, rg);
        this.matricula = matricula;
        this.tipoAluno = tipoAluno;
        this.classe = classe;
    }

    public Aluno(){
        
    }

    public String getMatricula(){
        return matricula;
    }

    public void setMatricula(String matricula){
        
    }
}


public class Instituição{
    private String Aluno;
    private String matricula; 
    
     public String getAluno(){
        return Aluno;
    }

    public void setAluno(String setAluno){
        this. Aluno = Aluno;
    
    }

    public String getmatricula(){
        return matricula;
    }

    public void setmatricula(String matricula){
        this. matricula = matricula;
    }

    public String toString(){
        return "\nAluno: " + this.getAluno() +
               "\nmatricula: " + this.getmatricula();
    }

    remove(Aluno):
}

public class Diciplina {
    public String Professor1;
    public String Quimica;
    public String Fisica
    
    public String getProfessor1(){
        return Professor1;
    }

    public void setProfessor1(String setProfessor1){
        this. Professor1 = Professor1;
    
    }

    public String getfisica(){
        return Fisica;
    }

    public void setfisica(String Fisica){
        this. Fisica = Fisica;
    }
     public String getquimica(){
        return Quimica;
    }

    public void setquimica(String Quimica){
        this. Quimica = Quimica;
    }

    public String toString(){
        return "\nProfessor1: " + this.getProfessor1() +
               "\nquimica: " + this.getquimica();
               "\fisica: " + thi.getfisica();
    }               
}

public class Diciplina {
    public String Professor1;
    public String Professor2;
    public String Fisica
    
    public String getProfessor1(){
        return Professor1;
    }

    public void setProfessor1(String setProfessor1){
        this. Professor1 = Professor1;
    
    }

    public String getfisica(){
        return Fisica;
    }

    public void setfisica(String Fisica){
        this. Fisica = Fisica;
    }
     public String getProfessor2(){
        return Professor2;
    }

    public void setProfessor2(String Professor2){
        this. Professor2 = Professor2;
    }

    public String toString(){
        return "\nProfessor1: " + this.getProfessor1() +
               "\nProfessor2: " + this.getProfessor2();
               "\fisica: " + thi.getfisica();
    }               
}

  <configuração>
   <exclui>
      <exclude>demo/package/Professor2.java<exclude>
      </excludes>
  </configuração>       
