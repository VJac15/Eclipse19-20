/*
This is to move the foundation if the robot is on the left side of the field and on the same side as the foundation.
Test and edit
TURN_TIME variable
RIGHT_SECONDS variable (amount of time it takes for robot to move to foundation
FOUNDATION_TIME (amount of time it takes robot to move in front of foundation.
FOUNDATION_RIGHT (amount of time it takes teh robot to move to the halfway point of the foundation so that it can move it.
REMAINING_TIME (amount of time it takes to complete the distance to the line. It is set to 0 for now.

 */

package org.firstinspires.ftc.teamcode;


import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.util.ElapsedTime;

@Autonomous (name = "MoveFoundation 2")
public class MoveFoundation2 extends LinearOpMode {

    HardwarePushbot robot = new HardwarePushbot();
    private ElapsedTime runtime = new ElapsedTime();

    public double TURN_TIME = .675;
    public double RIGHT_SECONDS = 1.5;
    public double FOUNDATION_TIME = .5;
    public double FOUNDATION_RIGHT = .25;
    public double MOVE_FOUNDATION = .25;
    public double REMAINING_TIME = 0;


    public void driveMethod (double rightPower, double leftPower, double seconds) {
        runtime.reset();
        while (runtime.seconds() < seconds) {
            robot.rightFrontDrive.setPower(rightPower);
            robot.leftFrontDrive.setPower(leftPower);
            robot.rightFrontDrive.setPower(rightPower);
            robot.rightFrontDrive.setPower(leftPower);
        }
    }

    public void strafeRight(double seconds) {
        runtime.reset();
        while (runtime.seconds() < seconds) {
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


    @Override
    public void runOpMode() throws InterruptedException {

        robot.init(hardwareMap);

        waitForStart();
        //move to foundation
        strafeLeft(RIGHT_SECONDS);
        //move to the front of the foundation
        driveMethod(1,1,FOUNDATION_TIME);
        strafeLeft(FOUNDATION_RIGHT);
        robot.rightPullSystem.setPosition(1);
        robot.leftPullSystem.setPosition(1);
        driveMethod(1,1, MOVE_FOUNDATION);

        strafeRight(FOUNDATION_RIGHT);
        driveMethod(-1,-1,FOUNDATION_TIME);
        strafeRight(RIGHT_SECONDS + REMAINING_TIME);


    }
}
