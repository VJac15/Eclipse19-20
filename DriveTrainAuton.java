package org.firstinspires.ftc.teamcode;


import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.util.ElapsedTime;

@Autonomous (name = "DriveTrainAuton")
public class DriveTrainAuton extends LinearOpMode {

    HardwarePushbot robot = new HardwarePushbot();
    private ElapsedTime runtime = new ElapsedTime();

    public void driveStraight(double seconds) {
        runtime.reset();
        while(runtime.seconds() < seconds){
            robot.leftBackDrive.setPower(1);
            robot.rightBackDrive.setPower(1);
            robot.leftFrontDrive.setPower(1);
            robot.rightFrontDrive.setPower(1);
        }
    }
    public void driveBack(double seconds) {
        runtime.reset();
        while(runtime.seconds() < seconds) {
            robot.leftBackDrive.setPower(-1);
            robot.rightBackDrive.setPower(-1);
            robot.leftFrontDrive.setPower(-1);
            robot.rightFrontDrive.setPower(-1);
        }
    }

    public void strafeRight(double seconds) {
        runtime.reset();
        while(runtime.seconds() < seconds) {
            robot.leftBackDrive.setPower(1);
            robot.rightBackDrive.setPower(1);
            robot.leftFrontDrive.setPower(-1);
            robot.rightFrontDrive.setPower(-1);
        }
    }

    public void strafeLeft(double seconds) {
        runtime.reset();
        while(runtime.seconds() < seconds) {
            robot.leftBackDrive.setPower(-1);
            robot.rightBackDrive.setPower(-1);
            robot.leftFrontDrive.setPower(1);
            robot.rightFrontDrive.setPower(1);
        }
    }

    public void driveMethod(double lp, double rp, double seconds) {
        runtime.reset();
        while (runtime.seconds() < seconds) {
            robot.rightBackDrive.setPower(rp);
            robot.rightFrontDrive.setPower(rp);
            robot.rightBackDrive.setPower(lp);
            robot.leftBackDrive.setPower(rp);
        }
    }
    @Override
    public void runOpMode() throws InterruptedException {


        robot.init(hardwareMap);
        driveStraight(.5);
        driveBack(.5);
        strafeLeft(.5);
        strafeRight(.5);
        driveMethod(1,1,.75);

    }
}
