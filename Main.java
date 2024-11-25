public class Main {

    static public void main(String[] args){
        User user = new User("Nabil", "nabil@gmail.com", "123456", null);
        Post post = new Post("Hello World!", user.getUserId());
        // Account account = new Account(user.getUserId(), "nabil@gmail.com", "123456");
        post.displayPost();
    }
}