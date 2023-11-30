public class Server {

    private String serve_name;
    private String server_ip;
    private String server_password;


    @Override
    public String toString() {
        return "Server{" +
                "serve_name='" + serve_name + '\'' +
                ", server_ip='" + server_ip + '\'' +
                ", server_password='" + server_password + '\'' +
                '}';
    }

    public String getServe_name() {
        return serve_name;
    }

    public void setServe_name(String serve_name) {
        this.serve_name = serve_name;
    }

    public String getServer_ip() {
        return server_ip;
    }

    public void setServer_ip(String server_ip) {
        this.server_ip = server_ip;
    }

    public String getServer_password() {
        return server_password;
    }

    public void setServer_password(String server_password) {
        this.server_password = server_password;
    }
}
