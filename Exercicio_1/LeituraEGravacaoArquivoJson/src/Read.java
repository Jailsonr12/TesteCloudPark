import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Read {
    public void readConfiguration() {
        JSONObject objectJson = new JSONObject();

        setNameServer(objectJson);
        setIPServer(objectJson);
        setPasswordServer(objectJson);

        try (FileWriter nameFiller = new FileWriter("config.json")) {
            nameFiller.write(objectJson.toJSONString());
            System.out.println("\n"+ "Salvo com sucesso");
        } catch (
                IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(objectJson.toJSONString() + "\n");
    }

    private void setNameServer(JSONObject objetJson) {
        System.out.print("1 - Informe o nome do servidor: ");
        Scanner scanner = new Scanner(System.in);
        objetJson.put("server_name", scanner.nextLine());
    }

    private void setIPServer(JSONObject objetJson) {
        System.out.print("2 - Informe o IP do servidor: ");
        Scanner scanner = new Scanner(System.in);
        objetJson.put("server_ip", scanner.nextLine());
    }

    private void setPasswordServer(JSONObject objetJson) {
        System.out.print("3 - Informe a senha do servidor: ");
        Scanner scanner = new Scanner(System.in);
        objetJson.put("server_password", scanner.nextLine());
    }

}
