package fileSystem;

import java.util.Collection;

public interface FileConverse<T> {

    public T generate(String ...args);

    public Collection<T> all(Collection<String[]> dataset);

}
