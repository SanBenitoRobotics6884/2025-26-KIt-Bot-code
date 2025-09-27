package frc.robot.Swerve;

import frc.robot.Constants.DriveConstants;

public class SwerveConfig {
    
    public String Version = "1.0.0.0";
    public int LastState = 3;
    public Module[] Modules = new Module[] {
        

        new Module(
            DriveConstants.kFrontLeftModule, DriveConstants.kFrontLeftModuleID, DriveConstants.kModuleEncoder,
            new Motor(
                0, "Talon FX vers. C (Device ID 0)", "Talon FX vers. C", "C280627F50374E5320202047381710FF", "Galigma",
                new MotorType("WCP Kraken x60", 96.7, 120, 60), false
            ),
            new Motor(
                27, "Talon FX vers. C (Device ID 27)", "Talon FX vers. C", "C280627F50374E5320202047381710FF", "Galigma",
                new MotorType("WCP Kraken x60", 96.7, 120, 60), false
            ),
            false, false, "CANcoder", 0.0, 1, 1, 0, false, -1, -1, -1
        ),
        new Module(
            "Front Right", 1, null,
            new Motor(
                1, "Talon FX vers. C (Device ID 1)", "Talon FX vers. C", "C280627F50374E5320202047381710FF", "Galigma",
                new MotorType("WCP Kraken x60", 96.7, 120, 60), false
            ),
            new Motor(
                3, "Front Left Steer", "Talon FX vers. C", "C280627F50374E5320202047381710FF", "Galigma",
                new MotorType("WCP Kraken x60", 96.7, 120, 60), false
            ),
            false, false, null, 0.0, 1, 1, 0, false, -1, -1, -1
        ),
        new Module(
            "Back Left", 2, null,
            new Motor(
                4, "Talon FX vers. C (Device ID 4)", "Talon FX vers. C", "C280627F50374E5320202047381710FF", "Galigma",
                new MotorType("WCP Kraken x60", 96.7, 120, 60), false
            ),
            new Motor(
                5, "Talon FX vers. C (Device ID 5)", "Talon FX vers. C", "C280627F50374E5320202047381710FF", "Galigma",
                new MotorType("WCP Kraken x60", 96.7, 120, 60), false
            ),
            false, false, null, 0.0, 1, 1, 0, false, -1, -1, -1
        ),
        new Module(
            "Back Right", 3, null,
            new Motor(
                6, "Talon FX vers. C (Device ID 6)", "Talon FX vers. C", "C280627F50374E5320202047381710FF", "Galigma",
                new MotorType("WCP Kraken x60", 96.7, 120, 60), false
            ),
            new Motor(
                2, "Talon FX vers. C (Device ID 2)", "Talon FX vers. C", "C280627F50374E5320202047381710FF", "Galigma",
                new MotorType("WCP Kraken x60", 96.7, 120, 60), false
            ),
            false, false, "CANcoder", 0.0, 1, 1, 0, false, -1, -1, -1
        )
    };
    public SwerveOptions SwerveOptions = new SwerveOptions(
        5.213368288877142,
        new Gyro(
            0, "Pigeon 2 vers. S (Device ID 0)", "Pigeon 2 vers. S", "C280627F50374E5320202047381710FF",
            "Galigma", null, false
        ),
        true, 21.75, 21.75, 2.0, false, true, 4,
        new SwerveModuleConfiguration(4, 6.122448979591837, 21.428571428571427, 3.5714285714285716, "L3"),
        false, "Swerve Drive Specialties (SDS)", false, true
    );

    public static class Module {
        public String ModuleName;
        public int ModuleId;
        public Object Encoder;
        public Motor SteerMotor;
        public Motor DriveMotor;
        public boolean IsEncoderInverted;
        public boolean IsSteerInverted;
        public String SelectedEncoderType;
        public double EncoderOffset;
        public int DriveMotorSelectionState;
        public int SteerMotorSelectionState;
        public int SteerEncoderSelectionState;
        public boolean IsModuleValidationComplete;
        public int ValidatedSteerId;
        public int ValidatedDriveId;
        public int ValidatedEncoderId;

        public Module(String ModuleName, int ModuleId, Object Encoder, Motor SteerMotor, Motor DriveMotor,
                      boolean IsEncoderInverted, boolean IsSteerInverted, String SelectedEncoderType, double EncoderOffset,
                      int DriveMotorSelectionState, int SteerMotorSelectionState, int SteerEncoderSelectionState,
                      boolean IsModuleValidationComplete, int ValidatedSteerId, int ValidatedDriveId, int ValidatedEncoderId) {
            this.ModuleName = ModuleName;
            this.ModuleId = ModuleId;
            this.Encoder = Encoder;
            this.SteerMotor = SteerMotor;
            this.DriveMotor = DriveMotor;
            this.IsEncoderInverted = IsEncoderInverted;
            this.IsSteerInverted = IsSteerInverted;
            this.SelectedEncoderType = SelectedEncoderType;
            this.EncoderOffset = EncoderOffset;
            this.DriveMotorSelectionState = DriveMotorSelectionState;
            this.SteerMotorSelectionState = SteerMotorSelectionState;
            this.SteerEncoderSelectionState = SteerEncoderSelectionState;
            this.IsModuleValidationComplete = IsModuleValidationComplete;
            this.ValidatedSteerId = ValidatedSteerId;
            this.ValidatedDriveId = ValidatedDriveId;
            this.ValidatedEncoderId = ValidatedEncoderId;
        }
    }

    public static class Motor {
        public int Id;
        public String Name;
        public String Model;
        public String CANbus;
        public String CANbusFriendly;
        public MotorType SelectedMotorType;
        public boolean IsStandaloneFx;

        public Motor(int Id, String Name, String Model, String CANbus, String CANbusFriendly, MotorType SelectedMotorType, boolean IsStandaloneFx) {
            this.Id = Id;
            this.Name = Name;
            this.Model = Model;
            this.CANbus = CANbus;
            this.CANbusFriendly = CANbusFriendly;
            this.SelectedMotorType = SelectedMotorType;
            this.IsStandaloneFx = IsStandaloneFx;
        }
    }

    public static class MotorType {
        public String Name;
        public double FreeSpeedRps;
        public int SlipCurrentLimit;
        public int StatorCurrentLimit;

        public MotorType(String Name, double FreeSpeedRps, int SlipCurrentLimit, int StatorCurrentLimit) {
            this.Name = Name;
            this.FreeSpeedRps = FreeSpeedRps;
            this.SlipCurrentLimit = SlipCurrentLimit;
            this.StatorCurrentLimit = StatorCurrentLimit;
        }
    }

    public static class SwerveOptions {
        public double kSpeedAt12Volts;
        public Gyro Gyro;
        public boolean IsValidGyroCANbus;
        public double VerticalTrackSizeInches;
        public double HorizontalTrackSizeInches;
        public double WheelRadiusInches;
        public boolean IsLeftSideInverted;
        public boolean IsRightSideInverted;
        public int SwerveModuleType;
        public SwerveModuleConfiguration SwerveModuleConfiguration;
        public boolean HasVerifiedSteer;
        public String SelectedModuleManufacturer;
        public boolean HasVerifiedDrive;
        public boolean IsValidConfiguration;

        public SwerveOptions(double kSpeedAt12Volts, Gyro Gyro, boolean IsValidGyroCANbus,
                             double VerticalTrackSizeInches, double HorizontalTrackSizeInches, double WheelRadiusInches,
                             boolean IsLeftSideInverted, boolean IsRightSideInverted, int SwerveModuleType,
                             SwerveModuleConfiguration SwerveModuleConfiguration, boolean HasVerifiedSteer,
                             String SelectedModuleManufacturer, boolean HasVerifiedDrive, boolean IsValidConfiguration) {
            this.kSpeedAt12Volts = kSpeedAt12Volts;
            this.Gyro = Gyro;
            this.IsValidGyroCANbus = IsValidGyroCANbus;
            this.VerticalTrackSizeInches = VerticalTrackSizeInches;
            this.HorizontalTrackSizeInches = HorizontalTrackSizeInches;
            this.WheelRadiusInches = WheelRadiusInches;
            this.IsLeftSideInverted = IsLeftSideInverted;
            this.IsRightSideInverted = IsRightSideInverted;
            this.SwerveModuleType = SwerveModuleType;
            this.SwerveModuleConfiguration = SwerveModuleConfiguration;
            this.HasVerifiedSteer = HasVerifiedSteer;
            this.SelectedModuleManufacturer = SelectedModuleManufacturer;
            this.HasVerifiedDrive = HasVerifiedDrive;
            this.IsValidConfiguration = IsValidConfiguration;
        }
    }

    public static class Gyro {
        public int Id;
        public String Name;
        public String Model;
        public String CANbus;
        public String CANbusFriendly;
        public MotorType SelectedMotorType;
        public boolean IsStandaloneFx;

        public Gyro(int Id, String Name, String Model, String CANbus, String CANbusFriendly, MotorType SelectedMotorType, boolean IsStandaloneFx) {
            this.Id = Id;
            this.Name = Name;
            this.Model = Model;
            this.CANbus = CANbus;
            this.CANbusFriendly = CANbusFriendly;
            this.SelectedMotorType = SelectedMotorType;
            this.IsStandaloneFx = IsStandaloneFx;
        }
    }

    public static class SwerveModuleConfiguration {
        public int ModuleBrand;
        public double DriveRatio;
        public double SteerRatio;
        public double CouplingRatio;
        public String CustomName;

        public SwerveModuleConfiguration(int ModuleBrand, double DriveRatio, double SteerRatio, double CouplingRatio, String CustomName) {
            this.ModuleBrand = ModuleBrand;
            this.DriveRatio = DriveRatio;
            this.SteerRatio = SteerRatio;
            this.CouplingRatio = CouplingRatio;
            this.CustomName = CustomName;
        }
    }
}