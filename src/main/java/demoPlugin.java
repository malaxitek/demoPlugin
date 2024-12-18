import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;

public class demoPlugin extends AnAction{

    @Override
    public void actionPerformed(AnActionEvent event) {
        Messages.showMessageDialog();
    }
}