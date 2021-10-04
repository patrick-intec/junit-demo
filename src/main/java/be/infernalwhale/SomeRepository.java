package be.infernalwhale;

public interface SomeRepository {
    String save(String s);
    boolean isSaved(String s);
    void delete(String s);
}
