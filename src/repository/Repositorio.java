package repository;
import java.util.HashMap;
import java.util.Map;

public class Repositorio<T> {
    private Map<Integer, T> entidades = new HashMap<>();

    public void adicionar(Integer id, T entidade) {
        entidades.put(id, entidade);
    }
}
