package swaglabs.model;

public enum SwaglabsUser {
    STANDARD_USER("standard_user", "secret_sauce");
    private final String username;
    private final String password;

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    SwaglabsUser(String username, String password)
    {
        this.username = username;
        this.password = password;
    }
}
