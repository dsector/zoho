package catalyst.crm.zoho.common;

/**
 * Created by rgb24 on 5/3/15.
 */
public interface Command<TReturn> {
    public TReturn execute();
}
