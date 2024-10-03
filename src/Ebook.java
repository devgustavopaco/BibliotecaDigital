public class Ebook extends ItemBibliotecaDigital implements Baixavel {

    private int numeroPaginas;

    public Ebook(String titulo, String autor, int numeroPaginas) {
        super(titulo, autor);
        this.numeroPaginas = numeroPaginas;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    @Override
    public String descricao() {
        return "Ebook: " + getTitulo() + " por " + getAutor() + ", " + numeroPaginas + " páginas.";
    }

    @Override
    public void baixar() {
        System.out.println("Baixando o ebook: " + getTitulo());
    }
}
