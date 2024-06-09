public class VerificaArquivo{
    try {
        File file = new File("respostas_padrao.txt");
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
        } else if (file.exists()) {
            Scanner leitorArquivo = new Scanner(file);
            currentLineFile = 0;

            while(leitorArquivo.hasNextLine()){
                
                //1) salva as linhas do arquivo em uma variavel String

            while (leitorArquivo.hasNextLine()) {

                String respostasArquivo = leitorArquivo.nextLine();
                respostas.salvarRespostas(respostasArquivo, currentLineFile);
                currentLineFile++;
            }
            leitorArquivo.close();
            }
        } else {
            file.createNewFile();
            try(BufferedWriter writer = new BufferedWriter(new FileWriter(file))){
                for(int i = 0; i < perguntas.getTamanhoPerguntas(); i++){
                    writer.write("A");
                    writer.newLine();
                }
            } catch (IOException e){
                System.err.println("Erro ao escrever no arquivo: " + e.getMessage());
            }
            
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
}