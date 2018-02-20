import java.lang.*;

/**
 */
public abstract class User implements Serializable, Clonable, Comparable {
    /**
     * id of employee or student
     */
    private String id;

    /**
     * password of employee or student
     */
    private String password;

    /**
     */
    private String name;

    /**
     */
    private String surname;

    /**
     * @return 
     */
    public String getId() {
        return null;
    }

    /**
     * @param id 
     */
    public void setId(String id) {
    }

    /**
     * @return 
     */
    public String getPassword() {
        return null;
    }

    /**
     * @param password 
     */
    public void setPassword(String password) {
    }

    /**
     * @return 
     */
    public String toString() {
        return null;
    }

    /**
     * @return 
     */
    public String getName() {
        return null;
    }

    /**
     * @param name 
     */
    public void setName(String name) {
    }

    /**
     * @return 
     */
    public String getSurname() {
        return null;
    }

    /**
     * @param surname 
     */
    public void setSurname(String surname) {
    }

    /**
     * @return 
     */
    public boolean equals() {
        return false;
    }

    /**
     * @return 
     */
    public int compareTo() {
        return 0;
    }

    /**
     * @return 
     */
    public User clone() {
        return null;
    }

    /**
     * @return 
     */
    public int hashCode() {
        return 0;
    }
}

