package psn.xshirmp.di;

import java.util.Map;

/**
 * The duty of {@code Injeceting} is to help some instances attribute or function parameters,
 * with annotation @Inject identifier, get the matched value from the injection container and
 * inject into it.
 *
 * @project di-core
 * @time 2018/2/27 14:48
 */
public interface Injeceting {

    /**
     * If @Inject annotation is annotated on class, to inject the appropriate value to its
     * instance from the injection container.
     *
     * @param instance actually instance
     */
    void injectElement(Object instance);

//    Map<Key<?>, Value<?>> getBindings();

    Map<?, ?> getBindings();

}
