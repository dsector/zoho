package catalyst.common;

/**
 * Created by rgb on 4/9/15.
 */
public interface CommandHandler<TReturn, TCommand> {
    public TReturn execute(TCommand command);
}
