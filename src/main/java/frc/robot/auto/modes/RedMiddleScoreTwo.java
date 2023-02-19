package frc.robot.auto.modes;

import java.util.HashMap;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.subsystems.Swerve;

public class RedMiddleScoreTwo extends SequentialCommandGroup{
    public RedMiddleScoreTwo() {
        String path = "Red Middle Score Overcharge Pickup Roundcharge Score";
        HashMap<String, Command> eventMap = new HashMap<String, Command>();

        var swerve = Swerve.getInstance();
        swerve.followTrajectoryCommand(path, eventMap, true);
        
    }
}