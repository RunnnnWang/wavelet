
import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;

public class SearchEngine {

    // The one bit of state on the server: a number that will be manipulated by
    // various requests.
    ArrayList<String> lists =new ArrayList<>();

    public String handleRequest(URI url) {
        if (url.getPath().equals("/")) {
            String 
            return String.format("Run Wang's string: %d", num);
        } else if (url.getPath().contains("/search")) {
            
            return String.format("Number incremented!");
        } else {
            System.out.println("Path: " + url.getPath());
            if (url.getPath().contains("/add")) {
                String[] parameters = url.getQuery().split("=");
                if (parameters[0].equals("s")) {
                    lists.add(parameters[1]);
                    return String.format("List added by %s! It's now %d", parameters[1], num);
                }
            }
            return "404 Not Found!";
        }
    }
}

class NumberServer {
    public static void main(String[] args) throws IOException {
        if(args.length == 0){
            System.out.println("Missing port number! Try any number between 1024 to 49151");
            return;
        }

        int port = Integer.parseInt(args[0]);

        Server.start(port, new Handler());
    }
}

}
