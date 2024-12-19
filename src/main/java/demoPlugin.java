import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.ui.Messages;
import java.time.LocalTime;

public class demoPlugin extends AnAction{

    @Override
    public void actionPerformed(AnActionEvent event) {
        LocalTime currentTime = LocalTime.now();

        if (currentTime.getHour() == 14 && currentTime.getMinute() == 0) {
            Messages.showMessageDialog("Пора на обед!", "Важно", Messages.getInformationIcon());
        } else {
            Messages.showMessageDialog("Текущее время: " + currentTime.toString(), "Важно", Messages.getInformationIcon());
        }
    }
}