package org.firstinspires.ftc.teamcode;

//------------------------------ImportStuff-------------------------------------------------------\\

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Servo;



//------------------------------ActualLoop--------------------------------------------------------\\

@Disabled
public class HardWare extends OpMode {

//------------------------------DC/Servo----------------------------------------------------------\\

    public DcMotor LeftFront  = null;
    public DcMotor LeftRear   = null;
    public DcMotor RightFront = null;
    public DcMotor RightRear  = null;
    public Servo   Belt       = null;

//------------------------------InitLoop----------------------------------------------------------\\

    @Override
    public void init() {

//------------------------------PhoneHardWareMap--------------------------------------------------\\

        LeftRear    = hardwareMap.dcMotor.get (" Back_Left_Drive   ");
        LeftFront   = hardwareMap.dcMotor.get (" Front_Left_Drive  ");
        RightFront  = hardwareMap.dcMotor.get (" Front_Right_Drive ");
        RightRear   = hardwareMap.dcMotor.get (" Back_Right_Drive  ");

//------------------------------Direction---------------------------------------------------------\\

        LeftFront .setDirection(DcMotorSimple.Direction.REVERSE);
        LeftRear  .setDirection(DcMotorSimple.Direction.REVERSE);
        RightFront.setDirection(DcMotorSimple.Direction.REVERSE);
        RightRear .setDirection(DcMotorSimple.Direction.REVERSE);

    }

//------------------------------OpMode------------------------------------------------------------\\

    @Override
    public void loop() {

    }

}