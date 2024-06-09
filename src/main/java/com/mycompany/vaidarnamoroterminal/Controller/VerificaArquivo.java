import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class VerificaArquivo {
    public static void main(String[] args) {
        try {
            VerificarResposta respostas = new VerificarResposta(); //   Suponho que exista uma classe Respostas que você esteja usando
            QuestionarioController perguntas = new QuestionarioController();
            int currentLineFile;

            File arquivoUsuario = new File("Perfil_Usuario.txt");
            if (arquivoUsuario.exists()) {
                Scanner leitorArquivo = new Scanner(arquivoUsuario);
                currentLineFile = 0;
                while (leitorArquivo.hasNextLine()) {
                    String respostasArquivo = leitorArquivo.nextLine();
                    respostas.salvarRespostas(respostasArquivo, currentLineFile);
                    currentLineFile++;
                }
                leitorArquivo.close();
            } else {
                File file = new File("respostas_padrao.txt");
                if (file.exists()) {
                    Scanner leitorArquivo = new Scanner(file);
                    currentLineFile = 0;

                    while (leitorArquivo.hasNextLine()) {
                        String respostasArquivo = leitorArquivo.nextLine();
                        respostas.salvarRespostas(respostasArquivo, currentLineFile);
                        currentLineFile++;
                    }
                    leitorArquivo.close();
                } else {
                    file.createNewFile();
                    try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
                        for (int i = 0; i < perguntas.getTamanhoPerguntas(); i++) {
                            writer.write("A");
                            writer.newLine();
                        }
                    } catch (IOException e) {
                        System.err.println("Erro ao escrever no arquivo: " + e.getMessage());
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
