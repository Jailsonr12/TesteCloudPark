public class Server {

    private String server_name;
    private String server_ip;
    private String server_password;


    @Override
    public String toString() {
        return "Server{" +
                "server_name='" + server_name + '\'' +
                ", server_ip='" + server_ip + '\'' +
                ", server_password='" + server_password + '\'' +
                '}';
    }


    public void setServer_name(String serve_name) {
        this.server_name = serve_name;
    }

    public void setServer_ip(String server_ip) {
        this.server_ip = server_ip;
    }

    public void setServer_password(String server_password) {
        this.server_password = server_password;
    }
}
