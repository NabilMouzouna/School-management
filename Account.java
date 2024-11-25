public class Account {
    // Static variable for auto-incrementing IDs
    static int idCounter = 0;

    private String accountId = "A"; 
    private String userId;         
    private String[] postIds;      

    public Account(String userId, String[] postIds) {
        idCounter++;
        this.accountId += idCounter; 
        this.userId = userId;        
        this.postIds = postIds;      
    }

    // Getters
    public String getAccountId() {
        return accountId;
    }

    public String getUserId() {
        return userId;
    }

    public String[] getPostIds() {
        return postIds;
    }

    // Setters
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setPostIds(String[] postIds) {
        this.postIds = postIds;
    }

    // Add a post ID
    public void addPostId(String postId) {
        String[] newPostIds = new String[postIds.length + 1];
        System.arraycopy(postIds, 0, newPostIds, 0, postIds.length);
        newPostIds[postIds.length] = postId;
        this.postIds = newPostIds;
    }

    // Remove a post ID
    public void removePostId(String postId) {
        int index = -1;
        for (int i = 0; i < postIds.length; i++) {
            if (postIds[i].equals(postId)) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            String[] newPostIds = new String[postIds.length - 1];
            for (int i = 0, j = 0; i < postIds.length; i++) {
                if (i != index) {
                    newPostIds[j++] = postIds[i];
                }
            }
            this.postIds = newPostIds;
        }
    }

    public void displayAccount() {
        System.out.println("Account ID: " + accountId);
        System.out.println("User ID: " + userId);
        System.out.print("Post IDs: ");
        for (String postId : postIds) {
            System.out.print(postId + " ");
        }
        System.out.println();
    }
}