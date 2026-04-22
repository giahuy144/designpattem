package main.java.com.giahuy.designpattem.CommandPattern.smartoffice.command;

import main.java.com.giahuy.designpattem.CommandPattern.smartoffice.device.Projector;
import main.java.com.giahuy.designpattem.CommandPattern.smartoffice.device.ProjectorMode;

public class ProjectorSetModeCommand implements Command {
        private Projector projector;
        private ProjectorMode newMode;
        private ProjectorMode previousMode;

        public ProjectorSetModeCommand(Projector projector, ProjectorMode mode) {
            this.projector = projector;
            this.newMode = mode;
        }

        @Override
        public void execute() {
            this.previousMode = projector.getMode();
            projector.setMode(newMode);
        }

        @Override
        public void undo() {
            projector.setMode(previousMode);
        }
}
