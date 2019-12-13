/*
Teleop Commands:
Joysticks: Normal drive method
A button: move forward
B button: press once to lower servos, press again to raise servos.
X Button: press to turn on higher intake, release to stop them..
Y button: press to turn on lower intakes, release to stop them.
 */

package org.firstinspires.ftc.teamcode;


import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.util.ElapsedTime;

@TeleOp (name = "teleop[")
public class Teleop extends LinearOpMode {

    HardwarePushbot robot = new HardwarePushbot();
    private ElapsedTime runtime = new ElapsedTime();
    public int servoPosition = 0;
    public int lowerIntakeValue = 0;
    public int higherIntakeValue = 0;
    public double THRESHOLD = .3;

    @Override
    public void runOpMode() throws InterruptedException {
        robot.init(hardwareMap);


        waitForStart();


        while (opModeIsActive()) {
            //driving


            if (gamepad1.right_stick_y>THRESHOLD) {
                robot.rightFrontDrive.setPower(1);
                robot.rightBackDrive.setPower(1);
            }
            if (gamepad1.left_stick_y > THRESHOLD) {
                robot.leftFrontDrive.setPower(1);
                robot.leftBackDrive.setPower(1);
            } else if (gamepad1.a) {
                robot.rightFrontDrive.setPower(1);
                robot.rightBackDrive.setPower(1);
                robot.leftFrontDrive.setPower(1);
                robot.leftBackDrive.setPower(1);

            }
            else {
                robot.rightFrontDrive.setPower(0);
                robot.rightBackDrive.setPower(0);
                robot.leftFrontDrive.setPower(0);
                robot.leftBackDrive.setPower(0);
            }

            //Servos
            if (gamepad1.b && servoPosition == 0) {
                robot.rightPullSystem.setPosition(1);
                robot.leftPullSystem.setPosition(1);
                servoPosition = 1;
            } else if (gamepad1.b && servoPosition == 1) {
                robot.leftPullSystem.setPosition(0);
                robot.rightPullSystem.setPosition(0);
                servoPosition = 0;
            }
            // higher intake
            if (gamepad1.x) {
                robot.leftIntake.setPower(1);
                robot.rightIntake.setPower(1);


            } else {
                robot.leftIntake.setPower(0);
                robot.rightIntake.setPower(0);
            }

            //lower intake
            if (gamepad1.y) {
                robot.leftBackDrive.setPower(1);
                robot.rightBackIntake.setPower(1);
            } else {
                robot.rightBackIntake.setPower(0);
                robot.leftBackIntake.setPower(0);
            }


        }
    }

}