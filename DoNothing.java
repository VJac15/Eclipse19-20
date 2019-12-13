package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

@Autonomous (name = "init", group = "pushbot")
public class DoNothing extends LinearOpMode {
    HardwarePushbot robot = new HardwarePushbot();


    @Override
    public void runOpMode() {
        robot.init(hardwareMap);
    }


}
