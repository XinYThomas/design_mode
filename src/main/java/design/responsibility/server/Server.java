package design.responsibility.server;

import design.responsibility.middleware.Middleware;

import java.util.HashMap;

public class Server {
    private HashMap<String, String> users = new HashMap<>();
    private Middleware middleware;

    public void setMiddleware(Middleware middleware) {
        this.middleware = middleware;
    }

    public boolean logIn(String username, String password) {
        if(middleware.check(username, password)) {
            System.out.println("Authorization have been successful!");
            return true;
        }
        return false;
    }

    public void register(String username, String password) {
        users.put(username, password);
    }

    public boolean hasEmail(String email) {
        return users.containsKey(email);
    }

    public boolean isValidPassword(String email, String password) {
        return users.get(email).equals(password);
    }
}
