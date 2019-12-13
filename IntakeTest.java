package org.firstinspires.ftc.teamcode;


import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.util.ElapsedTime;

@Autonomous (name = "IntakeTest", group = "Pushbot")
public class IntakeTest extends LinearOpMode {


    HardwarePushbot robot = new HardwarePushbot();
    private ElapsedTime runtime = new ElapsedTime();


    @Override
    public void runOpMode() throws InterruptedException {


        robot.init(hardwareMap);


        waitForStart();
        runtime.reset();

        robot.rightIntake.setPower(1);
        robot.rightBackIntake.setPower(1);

        if (runtime.seconds() > 5) {
            runtime.reset();
            robot.rightIntake.setPower(0);
            robot.rightBackIntake.setPower(0);
            robot.leftIntake.setPower(1);
            robot.leftBackIntake.setPower(1);

        }


    }
}
