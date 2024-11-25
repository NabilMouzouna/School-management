package classes;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Post {
    // Static variable for auto-incrementing IDs
    static int idCounter = 0;

    private String postId = "P";
    private String content;
    private LocalDateTime createdAt;

    public Post(String content) {
        idCounter++;
        this.postId += idCounter;
        this.content = content;
        this.createdAt = LocalDateTime.now(); // Sets current date and time
    }

    public String getPostId() {
        return postId;
    }

    public String getContent() {
        return content;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    // Format the createdAt property into a human-readable format
    public String getFormattedCreatedAt() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        return createdAt.format(formatter); // Returns formatted string
    }

    public void setPostId(String postId) {
        this.postId = postId;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public void displayPost() {
        System.out.println("Post ID: " + postId);
        System.out.println("Content: " + content);
        System.out.println("Created At: " + getFormattedCreatedAt());
    }
}