package AulaPratica_1;

public class Livro implements Publicacao{

    //Atributos
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtutal;
    private boolean aberto;
    private Pessoa leitor;


    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.aberto = false;
        this.pagAtutal = 0;
        this.leitor = leitor;
    }

    //Metodos Especiais
//    public String detalhes(){
//        return "Livro{" + "titulo=" + titulo + ", autor="
//                + autor + ", totPaginas=" + totPaginas
//                + ", pagAtual=" + pagAtutal + ", aberto="
//                + aberto + ", leitor=" + leitor + '}';
//    }


    @Override
    public String detalhes() {
        return "Livro{" +
                "titulo='" + titulo +
                "\n, autor='" + autor +
                "\n, totPaginas=" + totPaginas +
                "\n, pagAtutal=" + pagAtutal +
                "\n, aberto=" + aberto +
                "\n, leitor=" + leitor.getNome() +
                "\n, idade=" + leitor.getIdade() +
                "\n, sexo=" + leitor.getSexo() +
                '}';
    }

    @Override
    public void abrir() {
        this.aberto = true;
    }

    @Override
    public void fechar() {
        this.aberto = false;
    }

    @Override
    public void folhear(int p) {
        if (p > this.totPaginas){
            this.pagAtutal = 0;
        } else {
            this.pagAtutal = p;

        }
    }

    @Override
    public void avancarPag() {
        this.pagAtutal++;
    }

    @Override
    public void voltarPag() {
        this.pagAtutal--;
    }

    //Getters and Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtutal() {
        return pagAtutal;
    }

    public void setPagAtutal(int pagAtutal) {
        this.pagAtutal = pagAtutal;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }
}
