import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Read {

    private Server server;

    public void readConfiguration() {

        FileWriter nameFiller = null;
        JSONObject objetJson = new JSONObject();

        setNameServer(objetJson);
        setIPServer(objetJson);
        setPasswordServer(objetJson);

        try {
            nameFiller = new FileWriter("config.json");
            nameFiller.write(objetJson.toJSONString());
            nameFiller.close();
            System.out.println("Salvo com sucesso");
        } catch (
                IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(objetJson.toJSONString());

    }

    private void setNameServer(JSONObject objetJson) {
        System.out.print("1 - Informe o nome do servidor:");
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
