package catalyst.common;

/**
 * Created by rgb on 4/9/15.
 */
public interface AppService<TReturn, TCommand> {
    public TReturn execute(TCommand command);
}
