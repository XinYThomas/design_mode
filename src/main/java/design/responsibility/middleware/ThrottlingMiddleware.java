package design.responsibility.middleware;

// 检查请求数量限制

public class ThrottlingMiddleware extends Middleware{
    private int requestPerMinute;
    private int request;
    private long currentTime;

    public ThrottlingMiddleware(int requestPerMinute) {
        this.requestPerMinute = requestPerMinute;
        this.currentTime = System.currentTimeMillis();
    }

    public boolean check(String email, String password) {
        if(System.currentTimeMillis() > currentTime + 60_000) {
            request = 0;
            currentTime = System.currentTimeMillis();
        }

        request++;

        if(request > requestPerMinute) {
            System.out.println("Request Limit exceeded");
            // 不安全
//            Thread.currentThread().stop();
            Thread.currentThread().interrupt();
        }

        return cheakNext(email, password);
    }
}