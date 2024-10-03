public class Main {
    public static void main(String[] args) {

        Ebook ebook1 = new Ebook("Java: Como Programar", "Deitel", 1200);
        Ebook ebook2 = new Ebook("Clean Code", "Robert C. Martin", 464);

        VideoDigital video1 = new VideoDigital("Estruturas de Dados em Java", "Gustavo Paçó", 90);
        VideoDigital video2 = new VideoDigital("Design Patterns: Padrões de Projeto", "Gustavo Paçó", 60);

        System.out.println(ebook1.descricao());
        ebook1.baixar();

        System.out.println(ebook2.descricao());
        ebook2.baixar();

        System.out.println(video1.descricao());
        video1.baixar();
        video1.visualizar();

        System.out.println(video2.descricao());
        video2.baixar();
        video2.visualizar();
    }
}
