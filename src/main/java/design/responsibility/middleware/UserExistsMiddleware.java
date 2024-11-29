package design.responsibility.middleware;

// 检查用户登陆信息

import design.responsibility.server.Server;

public class UserExistsMiddleware extends Middleware {
    private Server server;

    public UserExistsMiddleware(Server server) {
        this.server = server;
    }

    public boolean check(String email, String password) {
        if(!server.hasEmail(email)) {
            System.out.println("This email is not registered!");

            return false;
        }

        if(!server.isValidPassword(email, password)) {
            System.out.println("This password is not valid!");
            return false;
        }

        return true;
    }
}
