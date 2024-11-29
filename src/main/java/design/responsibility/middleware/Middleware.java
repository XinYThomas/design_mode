package design.responsibility.middleware;

// 基础验证接口

public abstract class Middleware {
    private Middleware next;
    public static Middleware link(Middleware first, Middleware... chan){
        Middleware head = first;
        for(Middleware ch : chan){
            head.next = ch;
            head = ch;
        }
        return first;
    }

    public abstract boolean check(String email, String password);

    public boolean cheakNext(String email, String password){
        if(next == null)
            return true;
        return next.cheakNext(email, password);
    }
}
