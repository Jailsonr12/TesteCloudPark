import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Write {

    public void writerConfiguration() {
        JSONParser parser = new JSONParser();
        Server serve = new Server();

        try {
            JSONObject jsonObject = (JSONObject) parser.parse(new FileReader("config.json"));
            serve.setServer_name((String) jsonObject.get("server_name"));
            serve.setServer_ip((String) jsonObject.get("server_ip"));
            serve.setServer_password((String) jsonObject.get("server_password"));
            System.out.println(serve.toString());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
