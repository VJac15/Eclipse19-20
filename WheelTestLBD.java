package org.firstinspires.ftc.teamcode;


import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

@Autonomous (name = "WheelTestLBD")
public class WheelTestLBD extends LinearOpMode {

    HardwarePushbot robot = new HardwarePushbot();
    @Override
    public void runOpMode() throws InterruptedException {

        robot.init(hardwareMap);
        robot.leftBackDrive.setPower(1);
    }
}


//LBD is the only one that moves forward