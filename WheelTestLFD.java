package org.firstinspires.ftc.teamcode;


import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

@Autonomous (name = "WheelTestLFD")
public class WheelTestLFD  extends LinearOpMode {

    HardwarePushbot robot = new HardwarePushbot();
    @Override
    public void runOpMode() throws InterruptedException {

        robot.init(hardwareMap);
        robot.leftFrontDrive.setPower(1);
    }
}
