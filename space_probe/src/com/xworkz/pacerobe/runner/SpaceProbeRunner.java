package com.xworkz.pacerobe.runner;

import com.xworkz.pacerobe.Dto.SpaceProbeDTO;

import java.time.LocalDateTime;
import java.util.*;

public class SpaceProbeRunner {



            public static void main(String[] args) {

                SpaceProbeDTO probe1 = new SpaceProbeDTO(1, "Mission-1", "Mars", "NASA", 1010.0, LocalDateTime.of(2020, 1, 1, 10, 30), LocalDateTime.of(2022, 1, 1, 9, 15), "Chemical", 2005.0, "X-Band", 1100000.0, 10.1, "Camera", "Spectrometer", 301, false, "Active", 99.9, "Trajectory-1");
                SpaceProbeDTO probe2 = new SpaceProbeDTO(2, "Mission-2", "Venus", "ISRO", 1020.0, LocalDateTime.of(2021, 2, 2, 10, 30), LocalDateTime.of(2023, 2, 2, 9, 15), "Ion", 2010.0, "X-Band", 1200000.0, 10.2, "Spectrometer", "Radar", 302, true, "Completed", 99.8, "Trajectory-2");
                SpaceProbeDTO probe3 = new SpaceProbeDTO(3, "Mission-3", "Jupiter", "ESA", 1030.0, LocalDateTime.of(2022, 3, 3, 10, 30), LocalDateTime.of(2024, 3, 3, 9, 15), "Nuclear", 2015.0, "X-Band", 1300000.0, 10.3, "Radar", "Magnetometer", 303, false, "Standby", 99.7, "Trajectory-3");
                SpaceProbeDTO probe4 = new SpaceProbeDTO(4, "Mission-4", "Saturn", "JAXA", 1040.0, LocalDateTime.of(2023, 4, 4, 10, 30), LocalDateTime.of(2025, 4, 4, 9, 15), "Electric", 2020.0, "X-Band", 1400000.0, 10.4, "Magnetometer", "Thermal Sensor", 304, true, "Planned", 99.6, "Trajectory-4");
                SpaceProbeDTO probe5 = new SpaceProbeDTO(5, "Mission-5", "Mercury", "CNSA", 1050.0, LocalDateTime.of(2024, 5, 5, 10, 30), LocalDateTime.of(2026, 5, 5, 9, 15), "Solar Sail", 2025.0, "X-Band", 1500000.0, 10.5, "Thermal Sensor", "Camera", 305, false, "Active", 99.5, "Trajectory-5");
                SpaceProbeDTO probe6 = new SpaceProbeDTO(6, "Mission-6", "Neptune", "SpaceX", 1060.0, LocalDateTime.of(2025, 6, 6, 10, 30), LocalDateTime.of(2027, 6, 6, 9, 15), "Chemical", 2030.0, "X-Band", 1600000.0, 10.6, "Camera", "Spectrometer", 306, true, "Completed", 99.4, "Trajectory-6");
                SpaceProbeDTO probe7 = new SpaceProbeDTO(7, "Mission-7", "Uranus", "Roscosmos", 1070.0, LocalDateTime.of(2026, 7, 7, 10, 30), LocalDateTime.of(2028, 7, 7, 9, 15), "Ion", 2035.0, "X-Band", 1700000.0, 10.7, "Spectrometer", "Radar", 307, false, "Standby", 99.3, "Trajectory-7");
                SpaceProbeDTO probe8 = new SpaceProbeDTO(8, "Mission-8", "Pluto", "BlueOrigin", 1080.0, LocalDateTime.of(2027, 8, 8, 10, 30), LocalDateTime.of(2029, 8, 8, 9, 15), "Nuclear", 2040.0, "X-Band", 1800000.0, 10.8, "Radar", "Magnetometer", 308, true, "Planned", 99.2, "Trajectory-8");
                SpaceProbeDTO probe9 = new SpaceProbeDTO(9, "Mission-9", "Moon", "ULA", 1090.0, LocalDateTime.of(2028, 9, 9, 10, 30), LocalDateTime.of(2030, 9, 9, 9, 15), "Electric", 2045.0, "X-Band", 1900000.0, 10.9, "Magnetometer", "Thermal Sensor", 309, false, "Active", 99.1, "Trajectory-9");
                SpaceProbeDTO probe10 = new SpaceProbeDTO(10, "Mission-10", "Europa", "Boeing", 1100.0, LocalDateTime.of(2029, 10, 10, 10, 30), LocalDateTime.of(2031, 10, 10, 9, 15), "Solar Sail", 2050.0, "X-Band", 2000000.0, 11.0, "Thermal Sensor", "Camera", 310, true, "Completed", 99.0, "Trajectory-10");
                SpaceProbeDTO probe11 = new SpaceProbeDTO(11, "Mission-11", "Mars", "NASA", 1110.0, LocalDateTime.of(2020, 11, 11, 10, 30), LocalDateTime.of(2022, 11, 11, 9, 15), "Chemical", 2055.0, "X-Band", 2100000.0, 11.1, "Camera", "Spectrometer", 311, false, "Standby", 98.9, "Trajectory-11");
                SpaceProbeDTO probe12 = new SpaceProbeDTO(12, "Mission-12", "Venus", "ISRO", 1120.0, LocalDateTime.of(2021, 12, 12, 10, 30), LocalDateTime.of(2023, 12, 12, 9, 15), "Ion", 2060.0, "X-Band", 2200000.0, 11.2, "Spectrometer", "Radar", 312, true, "Planned", 98.8, "Trajectory-12");
                SpaceProbeDTO probe13 = new SpaceProbeDTO(13, "Mission-13", "Jupiter", "ESA", 1130.0, LocalDateTime.of(2022, 1, 13, 10, 30), LocalDateTime.of(2024, 1, 13, 9, 15), "Nuclear", 2065.0, "X-Band", 2300000.0, 11.3, "Radar", "Magnetometer", 313, false, "Active", 98.7, "Trajectory-13");
                SpaceProbeDTO probe14 = new SpaceProbeDTO(14, "Mission-14", "Saturn", "JAXA", 1140.0, LocalDateTime.of(2023, 2, 14, 10, 30), LocalDateTime.of(2025, 2, 14, 9, 15), "Electric", 2070.0, "X-Band", 2400000.0, 11.4, "Magnetometer", "Thermal Sensor", 314, true, "Completed", 98.6, "Trajectory-14");
                SpaceProbeDTO probe15 = new SpaceProbeDTO(15, "Mission-15", "Mercury", "CNSA", 1150.0, LocalDateTime.of(2024, 3, 15, 10, 30), LocalDateTime.of(2026, 3, 15, 9, 15), "Solar Sail", 2075.0, "X-Band", 2500000.0, 11.5, "Thermal Sensor", "Camera", 315, false, "Standby", 98.5, "Trajectory-15");
                SpaceProbeDTO probe16 = new SpaceProbeDTO(16, "Mission-16", "Neptune", "SpaceX", 1160.0, LocalDateTime.of(2025, 4, 16, 10, 30), LocalDateTime.of(2027, 4, 16, 9, 15), "Chemical", 2080.0, "X-Band", 2600000.0, 11.6, "Camera", "Spectrometer", 316, true, "Planned", 98.4, "Trajectory-16");
                SpaceProbeDTO probe17 = new SpaceProbeDTO(17, "Mission-17", "Uranus", "Roscosmos", 1170.0, LocalDateTime.of(2026, 5, 17, 10, 30), LocalDateTime.of(2028, 5, 17, 9, 15), "Ion", 2085.0, "X-Band", 2700000.0, 11.7, "Spectrometer", "Radar", 317, false, "Active", 98.3, "Trajectory-17");
                SpaceProbeDTO probe18 = new SpaceProbeDTO(18, "Mission-18", "Pluto", "BlueOrigin", 1180.0, LocalDateTime.of(2027, 6, 18, 10, 30), LocalDateTime.of(2029, 6, 18, 9, 15), "Nuclear", 2090.0, "X-Band", 2800000.0, 11.8, "Radar", "Magnetometer", 318, true, "Completed", 98.2, "Trajectory-18");
                SpaceProbeDTO probe19 = new SpaceProbeDTO(19, "Mission-19", "Moon", "ULA", 1190.0, LocalDateTime.of(2028, 7, 19, 10, 30), LocalDateTime.of(2030, 7, 19, 9, 15), "Electric", 2095.0, "X-Band", 2900000.0, 11.9, "Magnetometer", "Thermal Sensor", 319, false, "Standby", 98.1, "Trajectory-19");
                SpaceProbeDTO probe20 = new SpaceProbeDTO(20, "Mission-20", "Europa", "Boeing", 1200.0, LocalDateTime.of(2029, 8, 20, 10, 30), LocalDateTime.of(2031, 8, 20, 9, 15), "Solar Sail", 2100.0, "X-Band", 3000000.0, 12.0, "Thermal Sensor", "Camera", 320, true, "Planned", 98.0, "Trajectory-20");
                SpaceProbeDTO probe21 = new SpaceProbeDTO(21, "Mission-21", "Mars", "NASA", 1210.0, LocalDateTime.of(2020, 9, 21, 10, 30), LocalDateTime.of(2022, 9, 21, 9, 15), "Chemical", 2105.0, "X-Band", 3100000.0, 12.1, "Camera", "Spectrometer", 321, false, "Active", 97.9, "Trajectory-21");
                SpaceProbeDTO probe22 = new SpaceProbeDTO(22, "Mission-22", "Venus", "ISRO", 1220.0, LocalDateTime.of(2021, 10, 22, 10, 30), LocalDateTime.of(2023, 10, 22, 9, 15), "Ion", 2110.0, "X-Band", 3200000.0, 12.2, "Spectrometer", "Radar", 322, true, "Completed", 97.8, "Trajectory-22");
                SpaceProbeDTO probe23 = new SpaceProbeDTO(23, "Mission-23", "Jupiter", "ESA", 1230.0, LocalDateTime.of(2022, 11, 23, 10, 30), LocalDateTime.of(2024, 11, 23, 9, 15), "Nuclear", 2115.0, "X-Band", 3300000.0, 12.3, "Radar", "Magnetometer", 323, false, "Standby", 97.7, "Trajectory-23");
                SpaceProbeDTO probe24 = new SpaceProbeDTO(24, "Mission-24", "Saturn", "JAXA", 1240.0, LocalDateTime.of(2023, 12, 24, 10, 30), LocalDateTime.of(2025, 12, 24, 9, 15), "Electric", 2120.0, "X-Band", 3400000.0, 12.4, "Magnetometer", "Thermal Sensor", 324, true, "Planned", 97.6, "Trajectory-24");
                SpaceProbeDTO probe25 = new SpaceProbeDTO(25, "Mission-25", "Mercury", "CNSA", 1250.0, LocalDateTime.of(2024, 1, 25, 10, 30), LocalDateTime.of(2026, 1, 25, 9, 15), "Solar Sail", 2125.0, "X-Band", 3500000.0, 12.5, "Thermal Sensor", "Camera", 325, false, "Active", 97.5, "Trajectory-25");
                SpaceProbeDTO probe26 = new SpaceProbeDTO(26, "Mission-26", "Neptune", "SpaceX", 1260.0, LocalDateTime.of(2025, 2, 26, 10, 30), LocalDateTime.of(2027, 2, 26, 9, 15), "Chemical", 2130.0, "X-Band", 3600000.0, 12.6, "Camera", "Spectrometer", 326, true, "Completed", 97.4, "Trajectory-26");
                SpaceProbeDTO probe27 = new SpaceProbeDTO(27, "Mission-27", "Uranus", "Roscosmos", 1270.0, LocalDateTime.of(2026, 3, 27, 10, 30), LocalDateTime.of(2028, 3, 27, 9, 15), "Ion", 2135.0, "X-Band", 3700000.0, 12.7, "Spectrometer", "Radar", 327, false, "Standby", 97.3, "Trajectory-27");
                SpaceProbeDTO probe28 = new SpaceProbeDTO(28, "Mission-28", "Pluto", "BlueOrigin", 1280.0, LocalDateTime.of(2027, 4, 28, 10, 30), LocalDateTime.of(2029, 4, 28, 9, 15), "Nuclear", 2140.0, "X-Band", 3800000.0, 12.8, "Radar", "Magnetometer", 328, true, "Planned", 97.2, "Trajectory-28");
                SpaceProbeDTO probe29 = new SpaceProbeDTO(29, "Mission-29", "Moon", "ULA", 1290.0, LocalDateTime.of(2028, 5, 1, 10, 30), LocalDateTime.of(2030, 5, 1, 9, 15), "Electric", 2145.0, "X-Band", 3900000.0, 12.9, "Magnetometer", "Thermal Sensor", 329, false, "Active", 97.1, "Trajectory-29");
                SpaceProbeDTO probe30 = new SpaceProbeDTO(30, "Mission-30", "Europa", "Boeing", 1300.0, LocalDateTime.of(2029, 6, 2, 10, 30), LocalDateTime.of(2031, 6, 2, 9, 15), "Solar Sail", 2150.0, "X-Band", 4000000.0, 13.0, "Thermal Sensor", "Camera", 330, true, "Completed", 97.0, "Trajectory-30");
                SpaceProbeDTO probe31 = new SpaceProbeDTO(31, "Mission-31", "Mars", "NASA", 1310.0, LocalDateTime.of(2020, 7, 3, 10, 30), LocalDateTime.of(2022, 7, 3, 9, 15), "Chemical", 2155.0, "X-Band", 4100000.0, 13.1, "Camera", "Spectrometer", 331, false, "Standby", 96.9, "Trajectory-31");
                SpaceProbeDTO probe32 = new SpaceProbeDTO(32, "Mission-32", "Venus", "ISRO", 1320.0, LocalDateTime.of(2021, 8, 4, 10, 30), LocalDateTime.of(2023, 8, 4, 9, 15), "Ion", 2160.0, "X-Band", 4200000.0, 13.2, "Spectrometer", "Radar", 332, true, "Planned", 96.8, "Trajectory-32");
                SpaceProbeDTO probe33 = new SpaceProbeDTO(33, "Mission-33", "Jupiter", "ESA", 1330.0, LocalDateTime.of(2022, 9, 5, 10, 30), LocalDateTime.of(2024, 9, 5, 9, 15), "Nuclear", 2165.0, "X-Band", 4300000.0, 13.3, "Radar", "Magnetometer", 333, false, "Active", 96.7, "Trajectory-33");
                SpaceProbeDTO probe34 = new SpaceProbeDTO(34, "Mission-34", "Saturn", "JAXA", 1340.0, LocalDateTime.of(2023, 10, 6, 10, 30), LocalDateTime.of(2025, 10, 6, 9, 15), "Electric", 2170.0, "X-Band", 4400000.0, 13.4, "Magnetometer", "Thermal Sensor", 334, true, "Completed", 96.6, "Trajectory-34");
                SpaceProbeDTO probe35 = new SpaceProbeDTO(35, "Mission-35", "Mercury", "CNSA", 1350.0, LocalDateTime.of(2024, 11, 7, 10, 30), LocalDateTime.of(2026, 11, 7, 9, 15), "Solar Sail", 2175.0, "X-Band", 4500000.0, 13.5, "Thermal Sensor", "Camera", 335, false, "Standby", 96.5, "Trajectory-35");
                SpaceProbeDTO probe36 = new SpaceProbeDTO(36, "Mission-36", "Neptune", "SpaceX", 1360.0, LocalDateTime.of(2025, 12, 8, 10, 30), LocalDateTime.of(2027, 12, 8, 9, 15), "Chemical", 2180.0, "X-Band", 4600000.0, 13.6, "Camera", "Spectrometer", 336, true, "Planned", 96.4, "Trajectory-36");
                SpaceProbeDTO probe37 = new SpaceProbeDTO(37, "Mission-37", "Uranus", "Roscosmos", 1370.0, LocalDateTime.of(2026, 1, 9, 10, 30), LocalDateTime.of(2028, 1, 9, 9, 15), "Ion", 2185.0, "X-Band", 4700000.0, 13.7, "Spectrometer", "Radar", 337, false, "Active", 96.3, "Trajectory-37");
                SpaceProbeDTO probe38 = new SpaceProbeDTO(38, "Mission-38", "Pluto", "BlueOrigin", 1380.0, LocalDateTime.of(2027, 2, 10, 10, 30), LocalDateTime.of(2029, 2, 10, 9, 15), "Nuclear", 2190.0, "X-Band", 4800000.0, 13.8, "Radar", "Magnetometer", 338, true, "Completed", 96.2, "Trajectory-38");
                SpaceProbeDTO probe39 = new SpaceProbeDTO(39, "Mission-39", "Moon", "ULA", 1390.0, LocalDateTime.of(2028, 3, 11, 10, 30), LocalDateTime.of(2030, 3, 11, 9, 15), "Electric", 2195.0, "X-Band", 4900000.0, 13.9, "Magnetometer", "Thermal Sensor", 339, false, "Standby", 96.1, "Trajectory-39");
                SpaceProbeDTO probe40 = new SpaceProbeDTO(40, "Mission-40", "Europa", "Boeing", 1400.0, LocalDateTime.of(2029, 4, 12, 10, 30), LocalDateTime.of(2031, 4, 12, 9, 15), "Solar Sail", 2200.0, "X-Band", 5000000.0, 14.0, "Thermal Sensor", "Camera", 340, true, "Planned", 96.0, "Trajectory-40");
                SpaceProbeDTO probe41 = new SpaceProbeDTO(41, "Mission-41", "Mars", "NASA", 1410.0, LocalDateTime.of(2020, 5, 13, 10, 30), LocalDateTime.of(2022, 5, 13, 9, 15), "Chemical", 2205.0, "X-Band", 5100000.0, 14.1, "Camera", "Spectrometer", 341, false, "Active", 95.9, "Trajectory-41");
                SpaceProbeDTO probe42 = new SpaceProbeDTO(42, "Mission-42", "Venus", "ISRO", 1420.0, LocalDateTime.of(2021, 6, 14, 10, 30), LocalDateTime.of(2023, 6, 14, 9, 15), "Ion", 2210.0, "X-Band", 5200000.0, 14.2, "Spectrometer", "Radar", 342, true, "Completed", 95.8, "Trajectory-42");
                SpaceProbeDTO probe43 = new SpaceProbeDTO(43, "Mission-43", "Jupiter", "ESA", 1430.0, LocalDateTime.of(2022, 7, 15, 10, 30), LocalDateTime.of(2024, 7, 15, 9, 15), "Nuclear", 2215.0, "X-Band", 5300000.0, 14.3, "Radar", "Magnetometer", 343, false, "Standby", 95.7, "Trajectory-43");
                SpaceProbeDTO probe44 = new SpaceProbeDTO(44, "Mission-44", "Saturn", "JAXA", 1440.0, LocalDateTime.of(2023, 8, 16, 10, 30), LocalDateTime.of(2025, 8, 16, 9, 15), "Electric", 2220.0, "X-Band", 5400000.0, 14.4, "Magnetometer", "Thermal Sensor", 344, true, "Planned", 95.6, "Trajectory-44");
                SpaceProbeDTO probe45 = new SpaceProbeDTO(45, "Mission-45", "Mercury", "CNSA", 1450.0, LocalDateTime.of(2024, 9, 17, 10, 30), LocalDateTime.of(2026, 9, 17, 9, 15), "Solar Sail", 2225.0, "X-Band", 5500000.0, 14.5, "Thermal Sensor", "Camera", 345, false, "Active", 95.5, "Trajectory-45");
                SpaceProbeDTO probe46 = new SpaceProbeDTO(46, "Mission-46", "Neptune", "SpaceX", 1460.0, LocalDateTime.of(2025, 10, 18, 10, 30), LocalDateTime.of(2027, 10, 18, 9, 15), "Chemical", 2230.0, "X-Band", 5600000.0, 14.6, "Camera", "Spectrometer", 346, true, "Completed", 95.4, "Trajectory-46");
                SpaceProbeDTO probe47 = new SpaceProbeDTO(47, "Mission-47", "Uranus", "Roscosmos", 1470.0, LocalDateTime.of(2026, 11, 19, 10, 30), LocalDateTime.of(2028, 11, 19, 9, 15), "Ion", 2235.0, "X-Band", 5700000.0, 14.7, "Spectrometer", "Radar", 347, false, "Standby", 95.3, "Trajectory-47");
                SpaceProbeDTO probe48 = new SpaceProbeDTO(48, "Mission-48", "Pluto", "BlueOrigin", 1480.0, LocalDateTime.of(2027, 12, 20, 10, 30), LocalDateTime.of(2029, 12, 20, 9, 15), "Nuclear", 2240.0, "X-Band", 5800000.0, 14.8, "Radar", "Magnetometer", 348, true, "Planned", 95.2, "Trajectory-48");
                SpaceProbeDTO probe49 = new SpaceProbeDTO(49, "Mission-49", "Moon", "ULA", 1490.0, LocalDateTime.of(2028, 1, 21, 10, 30), LocalDateTime.of(2030, 1, 21, 9, 15), "Electric", 2245.0, "X-Band", 5900000.0, 14.9, "Magnetometer", "Thermal Sensor", 349, false, "Active", 95.1, "Trajectory-49");
                SpaceProbeDTO probe50 = new SpaceProbeDTO(50, "Mission-50", "Europa", "Boeing", 1500.0, LocalDateTime.of(2029, 2, 22, 10, 30), LocalDateTime.of(2031, 2, 22, 9, 15), "Solar Sail", 2250.0, "X-Band", 6000000.0, 15.0, "Thermal Sensor", "Camera", 350, true, "Completed", 95.0, "Trajectory-50");
                SpaceProbeDTO probe51 = new SpaceProbeDTO(51, "Mission-51", "Mars", "NASA", 1510.0, LocalDateTime.of(2020, 3, 23, 10, 30), LocalDateTime.of(2022, 3, 23, 9, 15), "Chemical", 2255.0, "X-Band", 6100000.0, 15.1, "Camera", "Spectrometer", 351, false, "Standby", 94.9, "Trajectory-51");
                SpaceProbeDTO probe52 = new SpaceProbeDTO(52, "Mission-52", "Venus", "ISRO", 1520.0, LocalDateTime.of(2021, 4, 24, 10, 30), LocalDateTime.of(2023, 4, 24, 9, 15), "Ion", 2260.0, "X-Band", 6200000.0, 15.2, "Spectrometer", "Radar", 352, true, "Planned", 94.8, "Trajectory-52");
                SpaceProbeDTO probe53 = new SpaceProbeDTO(53, "Mission-53", "Jupiter", "ESA", 1530.0, LocalDateTime.of(2022, 5, 25, 10, 30), LocalDateTime.of(2024, 5, 25, 9, 15), "Nuclear", 2265.0, "X-Band", 6300000.0, 15.3, "Radar", "Magnetometer", 353, false, "Active", 94.7, "Trajectory-53");
                SpaceProbeDTO probe54 = new SpaceProbeDTO(54, "Mission-54", "Saturn", "JAXA", 1540.0, LocalDateTime.of(2023, 6, 26, 10, 30), LocalDateTime.of(2025, 6, 26, 9, 15), "Electric", 2270.0, "X-Band", 6400000.0, 15.4, "Magnetometer", "Thermal Sensor", 354, true, "Completed", 94.6, "Trajectory-54");
                SpaceProbeDTO probe55 = new SpaceProbeDTO(55, "Mission-55", "Mercury", "CNSA", 1550.0, LocalDateTime.of(2024, 7, 27, 10, 30), LocalDateTime.of(2026, 7, 27, 9, 15), "Solar Sail", 2275.0, "X-Band", 6500000.0, 15.5, "Thermal Sensor", "Camera", 355, false, "Standby", 94.5, "Trajectory-55");
                SpaceProbeDTO probe56 = new SpaceProbeDTO(56, "Mission-56", "Neptune", "SpaceX", 1560.0, LocalDateTime.of(2025, 8, 28, 10, 30), LocalDateTime.of(2027, 8, 28, 9, 15), "Chemical", 2280.0, "X-Band", 6600000.0, 15.6, "Camera", "Spectrometer", 356, true, "Planned", 94.4, "Trajectory-56");
                SpaceProbeDTO probe57 = new SpaceProbeDTO(57, "Mission-57", "Uranus", "Roscosmos", 1570.0, LocalDateTime.of(2026, 9, 1, 10, 30), LocalDateTime.of(2028, 9, 1, 9, 15), "Ion", 2285.0, "X-Band", 6700000.0, 15.7, "Spectrometer", "Radar", 357, false, "Active", 94.3, "Trajectory-57");
                SpaceProbeDTO probe58 = new SpaceProbeDTO(58, "Mission-58", "Pluto", "BlueOrigin", 1580.0, LocalDateTime.of(2027, 10, 2, 10, 30), LocalDateTime.of(2029, 10, 2, 9, 15), "Nuclear", 2290.0, "X-Band", 6800000.0, 15.8, "Radar", "Magnetometer", 358, true, "Completed", 94.2, "Trajectory-58");
                SpaceProbeDTO probe59 = new SpaceProbeDTO(59, "Mission-59", "Moon", "ULA", 1590.0, LocalDateTime.of(2028, 11, 3, 10, 30), LocalDateTime.of(2030, 11, 3, 9, 15), "Electric", 2295.0, "X-Band", 6900000.0, 15.9, "Magnetometer", "Thermal Sensor", 359, false, "Standby", 94.1, "Trajectory-59");
                SpaceProbeDTO probe60 = new SpaceProbeDTO(60, "Mission-60", "Europa", "Boeing", 1600.0, LocalDateTime.of(2029, 12, 4, 10, 30), LocalDateTime.of(2031, 12, 4, 9, 15), "Solar Sail", 2300.0, "X-Band", 7000000.0, 16.0, "Thermal Sensor", "Camera", 360, true, "Planned", 94.0, "Trajectory-60");
                SpaceProbeDTO probe61 = new SpaceProbeDTO(61, "Mission-61", "Mars", "NASA", 1610.0, LocalDateTime.of(2020, 1, 5, 10, 30), LocalDateTime.of(2022, 1, 5, 9, 15), "Chemical", 2305.0, "X-Band", 7100000.0, 16.1, "Camera", "Spectrometer", 361, false, "Active", 93.9, "Trajectory-61");
                SpaceProbeDTO probe62 = new SpaceProbeDTO(62, "Mission-62", "Venus", "ISRO", 1620.0, LocalDateTime.of(2021, 2, 6, 10, 30), LocalDateTime.of(2023, 2, 6, 9, 15), "Ion", 2310.0, "X-Band", 7200000.0, 16.2, "Spectrometer", "Radar", 362, true, "Completed", 93.8, "Trajectory-62");
                SpaceProbeDTO probe63 = new SpaceProbeDTO(63, "Mission-63", "Jupiter", "ESA", 1630.0, LocalDateTime.of(2022, 3, 7, 10, 30), LocalDateTime.of(2024, 3, 7, 9, 15), "Nuclear", 2315.0, "X-Band", 7300000.0, 16.3, "Radar", "Magnetometer", 363, false, "Standby", 93.7, "Trajectory-63");
                SpaceProbeDTO probe64 = new SpaceProbeDTO(64, "Mission-64", "Saturn", "JAXA", 1640.0, LocalDateTime.of(2023, 4, 8, 10, 30), LocalDateTime.of(2025, 4, 8, 9, 15), "Electric", 2320.0, "X-Band", 7400000.0, 16.4, "Magnetometer", "Thermal Sensor", 364, true, "Planned", 93.6, "Trajectory-64");
                SpaceProbeDTO probe65 = new SpaceProbeDTO(65, "Mission-65", "Mercury", "CNSA", 1650.0, LocalDateTime.of(2024, 5, 9, 10, 30), LocalDateTime.of(2026, 5, 9, 9, 15), "Solar Sail", 2325.0, "X-Band", 7500000.0, 16.5, "Thermal Sensor", "Camera", 365, false, "Active", 93.5, "Trajectory-65");
                SpaceProbeDTO probe66 = new SpaceProbeDTO(66, "Mission-66", "Neptune", "SpaceX", 1660.0, LocalDateTime.of(2025, 6, 10, 10, 30), LocalDateTime.of(2027, 6, 10, 9, 15), "Chemical", 2330.0, "X-Band", 7600000.0, 16.6, "Camera", "Spectrometer", 366, true, "Completed", 93.4, "Trajectory-66");
                SpaceProbeDTO probe67 = new SpaceProbeDTO(67, "Mission-67", "Uranus", "Roscosmos", 1670.0, LocalDateTime.of(2026, 7, 11, 10, 30), LocalDateTime.of(2028, 7, 11, 9, 15), "Ion", 2335.0, "X-Band", 7700000.0, 16.7, "Spectrometer", "Radar", 367, false, "Standby", 93.3, "Trajectory-67");
                SpaceProbeDTO probe68 = new SpaceProbeDTO(68, "Mission-68", "Pluto", "BlueOrigin", 1680.0, LocalDateTime.of(2027, 8, 12, 10, 30), LocalDateTime.of(2029, 8, 12, 9, 15), "Nuclear", 2340.0, "X-Band", 7800000.0, 16.8, "Radar", "Magnetometer", 368, true, "Planned", 93.2, "Trajectory-68");
                SpaceProbeDTO probe69 = new SpaceProbeDTO(69, "Mission-69", "Moon", "ULA", 1690.0, LocalDateTime.of(2028, 9, 13, 10, 30), LocalDateTime.of(2030, 9, 13, 9, 15), "Electric", 2345.0, "X-Band", 7900000.0, 16.9, "Magnetometer", "Thermal Sensor", 369, false, "Active", 93.1, "Trajectory-69");
                SpaceProbeDTO probe70 = new SpaceProbeDTO(70, "Mission-70", "Europa", "Boeing", 1700.0, LocalDateTime.of(2029, 10, 14, 10, 30), LocalDateTime.of(2031, 10, 14, 9, 15), "Solar Sail", 2350.0, "X-Band", 8000000.0, 17.0, "Thermal Sensor", "Camera", 370, true, "Completed", 93.0, "Trajectory-70");
                SpaceProbeDTO probe71 = new SpaceProbeDTO(71, "Mission-71", "Mars", "NASA", 1710.0, LocalDateTime.of(2020, 11, 15, 10, 30), LocalDateTime.of(2022, 11, 15, 9, 15), "Chemical", 2355.0, "X-Band", 8100000.0, 17.1, "Camera", "Spectrometer", 371, false, "Standby", 92.9, "Trajectory-71");
                SpaceProbeDTO probe72 = new SpaceProbeDTO(72, "Mission-72", "Venus", "ISRO", 1720.0, LocalDateTime.of(2021, 12, 16, 10, 30), LocalDateTime.of(2023, 12, 16, 9, 15), "Ion", 2360.0, "X-Band", 8200000.0, 17.2, "Spectrometer", "Radar", 372, true, "Planned", 92.8, "Trajectory-72");
                SpaceProbeDTO probe73 = new SpaceProbeDTO(73, "Mission-73", "Jupiter", "ESA", 1730.0, LocalDateTime.of(2022, 1, 17, 10, 30), LocalDateTime.of(2024, 1, 17, 9, 15), "Nuclear", 2365.0, "X-Band", 8300000.0, 17.3, "Radar", "Magnetometer", 373, false, "Active", 92.7, "Trajectory-73");
                SpaceProbeDTO probe74 = new SpaceProbeDTO(74, "Mission-74", "Saturn", "JAXA", 1740.0, LocalDateTime.of(2023, 2, 18, 10, 30), LocalDateTime.of(2025, 2, 18, 9, 15), "Electric", 2370.0, "X-Band", 8400000.0, 17.4, "Magnetometer", "Thermal Sensor", 374, true, "Completed", 92.6, "Trajectory-74");
                SpaceProbeDTO probe75 = new SpaceProbeDTO(75, "Mission-75", "Mercury", "CNSA", 1750.0, LocalDateTime.of(2024, 3, 19, 10, 30), LocalDateTime.of(2026, 3, 19, 9, 15), "Solar Sail", 2375.0, "X-Band", 8500000.0, 17.5, "Thermal Sensor", "Camera", 375, false, "Standby", 92.5, "Trajectory-75");
                SpaceProbeDTO probe76 = new SpaceProbeDTO(76, "Mission-76", "Neptune", "SpaceX", 1760.0, LocalDateTime.of(2025, 4, 20, 10, 30), LocalDateTime.of(2027, 4, 20, 9, 15), "Chemical", 2380.0, "X-Band", 8600000.0, 17.6, "Camera", "Spectrometer", 376, true, "Planned", 92.4, "Trajectory-76");
                SpaceProbeDTO probe77 = new SpaceProbeDTO(77, "Mission-77", "Uranus", "Roscosmos", 1770.0, LocalDateTime.of(2026, 5, 21, 10, 30), LocalDateTime.of(2028, 5, 21, 9, 15), "Ion", 2385.0, "X-Band", 8700000.0, 17.7, "Spectrometer", "Radar", 377, false, "Active", 92.3, "Trajectory-77");
                SpaceProbeDTO probe78 = new SpaceProbeDTO(78, "Mission-78", "Pluto", "BlueOrigin", 1780.0, LocalDateTime.of(2027, 6, 22, 10, 30), LocalDateTime.of(2029, 6, 22, 9, 15), "Nuclear", 2390.0, "X-Band", 8800000.0, 17.8, "Radar", "Magnetometer", 378, true, "Completed", 92.2, "Trajectory-78");
                SpaceProbeDTO probe79 = new SpaceProbeDTO(79, "Mission-79", "Moon", "ULA", 1790.0, LocalDateTime.of(2028, 7, 23, 10, 30), LocalDateTime.of(2030, 7, 23, 9, 15), "Electric", 2395.0, "X-Band", 8900000.0, 17.9, "Magnetometer", "Thermal Sensor", 379, false, "Standby", 92.1, "Trajectory-79");
                SpaceProbeDTO probe80 = new SpaceProbeDTO(80, "Mission-80", "Europa", "Boeing", 1800.0, LocalDateTime.of(2029, 8, 24, 10, 30), LocalDateTime.of(2031, 8, 24, 9, 15), "Solar Sail", 2400.0, "X-Band", 9000000.0, 18.0, "Thermal Sensor", "Camera", 380, true, "Planned", 92.0, "Trajectory-80");
                SpaceProbeDTO probe81 = new SpaceProbeDTO(81, "Mission-81", "Mars", "NASA", 1810.0, LocalDateTime.of(2020, 9, 25, 10, 30), LocalDateTime.of(2022, 9, 25, 9, 15), "Chemical", 2405.0, "X-Band", 9100000.0, 18.1, "Camera", "Spectrometer", 381, false, "Active", 91.9, "Trajectory-81");
                SpaceProbeDTO probe82 = new SpaceProbeDTO(82, "Mission-82", "Venus", "ISRO", 1820.0, LocalDateTime.of(2021, 10, 26, 10, 30), LocalDateTime.of(2023, 10, 26, 9, 15), "Ion", 2410.0, "X-Band", 9200000.0, 18.2, "Spectrometer", "Radar", 382, true, "Completed", 91.8, "Trajectory-82");
                SpaceProbeDTO probe83 = new SpaceProbeDTO(83, "Mission-83", "Jupiter", "ESA", 1830.0, LocalDateTime.of(2022, 11, 27, 10, 30), LocalDateTime.of(2024, 11, 27, 9, 15), "Nuclear", 2415.0, "X-Band", 9300000.0, 18.3, "Radar", "Magnetometer", 383, false, "Standby", 91.7, "Trajectory-83");
                SpaceProbeDTO probe84 = new SpaceProbeDTO(84, "Mission-84", "Saturn", "JAXA", 1840.0, LocalDateTime.of(2023, 12, 28, 10, 30), LocalDateTime.of(2025, 12, 28, 9, 15), "Electric", 2420.0, "X-Band", 9400000.0, 18.4, "Magnetometer", "Thermal Sensor", 384, true, "Planned", 91.6, "Trajectory-84");
                SpaceProbeDTO probe85 = new SpaceProbeDTO(85, "Mission-85", "Mercury", "CNSA", 1850.0, LocalDateTime.of(2024, 1, 1, 10, 30), LocalDateTime.of(2026, 1, 1, 9, 15), "Solar Sail", 2425.0, "X-Band", 9500000.0, 18.5, "Thermal Sensor", "Camera", 385, false, "Active", 91.5, "Trajectory-85");
                SpaceProbeDTO probe86 = new SpaceProbeDTO(86, "Mission-86", "Neptune", "SpaceX", 1860.0, LocalDateTime.of(2025, 2, 2, 10, 30), LocalDateTime.of(2027, 2, 2, 9, 15), "Chemical", 2430.0, "X-Band", 9600000.0, 18.6, "Camera", "Spectrometer", 386, true, "Completed", 91.4, "Trajectory-86");
                SpaceProbeDTO probe87 = new SpaceProbeDTO(87, "Mission-87", "Uranus", "Roscosmos", 1870.0, LocalDateTime.of(2026, 3, 3, 10, 30), LocalDateTime.of(2028, 3, 3, 9, 15), "Ion", 2435.0, "X-Band", 9700000.0, 18.7, "Spectrometer", "Radar", 387, false, "Standby", 91.3, "Trajectory-87");
                SpaceProbeDTO probe88 = new SpaceProbeDTO(88, "Mission-88", "Pluto", "BlueOrigin", 1880.0, LocalDateTime.of(2027, 4, 4, 10, 30), LocalDateTime.of(2029, 4, 4, 9, 15), "Nuclear", 2440.0, "X-Band", 9800000.0, 18.8, "Radar", "Magnetometer", 388, true, "Planned", 91.2, "Trajectory-88");
                SpaceProbeDTO probe89 = new SpaceProbeDTO(89, "Mission-89", "Moon", "ULA", 1890.0, LocalDateTime.of(2028, 5, 5, 10, 30), LocalDateTime.of(2030, 5, 5, 9, 15), "Electric", 2445.0, "X-Band", 9900000.0, 18.9, "Magnetometer", "Thermal Sensor", 389, false, "Active", 91.1, "Trajectory-89");
                SpaceProbeDTO probe90 = new SpaceProbeDTO(90, "Mission-90", "Europa", "Boeing", 1900.0, LocalDateTime.of(2029, 6, 6, 10, 30), LocalDateTime.of(2031, 6, 6, 9, 15), "Solar Sail", 2450.0, "X-Band", 10000000.0, 19.0, "Thermal Sensor", "Camera", 390, true, "Completed", 91.0, "Trajectory-90");
                SpaceProbeDTO probe91 = new SpaceProbeDTO(91, "Mission-91", "Mars", "NASA", 1910.0, LocalDateTime.of(2020, 7, 7, 10, 30), LocalDateTime.of(2022, 7, 7, 9, 15), "Chemical", 2455.0, "X-Band", 10100000.0, 19.1, "Camera", "Spectrometer", 391, false, "Standby", 90.9, "Trajectory-91");
                SpaceProbeDTO probe92 = new SpaceProbeDTO(92, "Mission-92", "Venus", "ISRO", 1920.0, LocalDateTime.of(2021, 8, 8, 10, 30), LocalDateTime.of(2023, 8, 8, 9, 15), "Ion", 2460.0, "X-Band", 10200000.0, 19.2, "Spectrometer", "Radar", 392, true, "Planned", 90.8, "Trajectory-92");
                SpaceProbeDTO probe93 = new SpaceProbeDTO(93, "Mission-93", "Jupiter", "ESA", 1930.0, LocalDateTime.of(2022, 9, 9, 10, 30), LocalDateTime.of(2024, 9, 9, 9, 15), "Nuclear", 2465.0, "X-Band", 10300000.0, 19.3, "Radar", "Magnetometer", 393, false, "Active", 90.7, "Trajectory-93");
                SpaceProbeDTO probe94 = new SpaceProbeDTO(94, "Mission-94", "Saturn", "JAXA", 1940.0, LocalDateTime.of(2023, 10, 10, 10, 30), LocalDateTime.of(2025, 10, 10, 9, 15), "Electric", 2470.0, "X-Band", 10400000.0, 19.4, "Magnetometer", "Thermal Sensor", 394, true, "Completed", 90.6, "Trajectory-94");
                SpaceProbeDTO probe95 = new SpaceProbeDTO(95, "Mission-95", "Mercury", "CNSA", 1950.0, LocalDateTime.of(2024, 11, 11, 10, 30), LocalDateTime.of(2026, 11, 11, 9, 15), "Solar Sail", 2475.0, "X-Band", 10500000.0, 19.5, "Thermal Sensor", "Camera", 395, false, "Standby", 90.5, "Trajectory-95");
                SpaceProbeDTO probe96 = new SpaceProbeDTO(96, "Mission-96", "Neptune", "SpaceX", 1960.0, LocalDateTime.of(2025, 12, 12, 10, 30), LocalDateTime.of(2027, 12, 12, 9, 15), "Chemical", 2480.0, "X-Band", 10600000.0, 19.6, "Camera", "Spectrometer", 396, true, "Planned", 90.4, "Trajectory-96");
                SpaceProbeDTO probe97 = new SpaceProbeDTO(97, "Mission-97", "Uranus", "Roscosmos", 1970.0, LocalDateTime.of(2026, 1, 13, 10, 30), LocalDateTime.of(2028, 1, 13, 9, 15), "Ion", 2485.0, "X-Band", 10700000.0, 19.7, "Spectrometer", "Radar", 397, false, "Active", 90.3, "Trajectory-97");
                SpaceProbeDTO probe98 = new SpaceProbeDTO(98, "Mission-98", "Pluto", "BlueOrigin", 1980.0, LocalDateTime.of(2027, 2, 14, 10, 30), LocalDateTime.of(2029, 2, 14, 9, 15), "Nuclear", 2490.0, "X-Band", 10800000.0, 19.8, "Radar", "Magnetometer", 398, true, "Completed", 90.2, "Trajectory-98");
                SpaceProbeDTO probe99 = new SpaceProbeDTO(99, "Mission-99", "Moon", "ULA", 1990.0, LocalDateTime.of(2028, 3, 15, 10, 30), LocalDateTime.of(2030, 3, 15, 9, 15), "Electric", 2495.0, "X-Band", 10900000.0, 19.9, "Magnetometer", "Thermal Sensor", 399, false, "Standby", 90.1, "Trajectory-99");
                SpaceProbeDTO probe100 = new SpaceProbeDTO(100, "Mission-100", "Europa", "Boeing", 2000.0, LocalDateTime.of(2029, 4, 16, 10, 30), LocalDateTime.of(2031, 4, 16, 9, 15), "Solar Sail", 2500.0, "X-Band", 11000000.0, 20.0, "Thermal Sensor", "Camera", 400, true, "Planned", 90.0, "Trajectory-100");
                SpaceProbeDTO probe101 = new SpaceProbeDTO(101, "Mission-101", "Mars", "NASA", 2010.0, LocalDateTime.of(2020, 5, 17, 10, 30), LocalDateTime.of(2022, 5, 17, 9, 15), "Chemical", 2505.0, "X-Band", 11100000.0, 20.1, "Camera", "Spectrometer", 401, false, "Active", 89.9, "Trajectory-101");
                SpaceProbeDTO probe102 = new SpaceProbeDTO(102, "Mission-102", "Venus", "ISRO", 2020.0, LocalDateTime.of(2021, 6, 18, 10, 30), LocalDateTime.of(2023, 6, 18, 9, 15), "Ion", 2510.0, "X-Band", 11200000.0, 20.2, "Spectrometer", "Radar", 402, true, "Completed", 89.8, "Trajectory-102");
                SpaceProbeDTO probe103 = new SpaceProbeDTO(103, "Mission-103", "Jupiter", "ESA", 2030.0, LocalDateTime.of(2022, 7, 19, 10, 30), LocalDateTime.of(2024, 7, 19, 9, 15), "Nuclear", 2515.0, "X-Band", 11300000.0, 20.3, "Radar", "Magnetometer", 403, false, "Standby", 89.7, "Trajectory-103");
                SpaceProbeDTO probe104 = new SpaceProbeDTO(104, "Mission-104", "Saturn", "JAXA", 2040.0, LocalDateTime.of(2023, 8, 20, 10, 30), LocalDateTime.of(2025, 8, 20, 9, 15), "Electric", 2520.0, "X-Band", 11400000.0, 20.4, "Magnetometer", "Thermal Sensor", 404, true, "Planned", 89.6, "Trajectory-104");
                SpaceProbeDTO probe105 = new SpaceProbeDTO(105, "Mission-105", "Mercury", "CNSA", 2050.0, LocalDateTime.of(2024, 9, 21, 10, 30), LocalDateTime.of(2026, 9, 21, 9, 15), "Solar Sail", 2525.0, "X-Band", 11500000.0, 20.5, "Thermal Sensor", "Camera", 405, false, "Active", 89.5, "Trajectory-105");
                SpaceProbeDTO probe106 = new SpaceProbeDTO(106, "Mission-106", "Neptune", "SpaceX", 2060.0, LocalDateTime.of(2025, 10, 22, 10, 30), LocalDateTime.of(2027, 10, 22, 9, 15), "Chemical", 2530.0, "X-Band", 11600000.0, 20.6, "Camera", "Spectrometer", 406, true, "Completed", 89.4, "Trajectory-106");
                SpaceProbeDTO probe107 = new SpaceProbeDTO(107, "Mission-107", "Uranus", "Roscosmos", 2070.0, LocalDateTime.of(2026, 11, 23, 10, 30), LocalDateTime.of(2028, 11, 23, 9, 15), "Ion", 2535.0, "X-Band", 11700000.0, 20.7, "Spectrometer", "Radar", 407, false, "Standby", 89.3, "Trajectory-107");
                SpaceProbeDTO probe108 = new SpaceProbeDTO(108, "Mission-108", "Pluto", "BlueOrigin", 2080.0, LocalDateTime.of(2027, 12, 24, 10, 30), LocalDateTime.of(2029, 12, 24, 9, 15), "Nuclear", 2540.0, "X-Band", 11800000.0, 20.8, "Radar", "Magnetometer", 408, true, "Planned", 89.2, "Trajectory-108");
                SpaceProbeDTO probe109 = new SpaceProbeDTO(109, "Mission-109", "Moon", "ULA", 2090.0, LocalDateTime.of(2028, 1, 25, 10, 30), LocalDateTime.of(2030, 1, 25, 9, 15), "Electric", 2545.0, "X-Band", 11900000.0, 20.9, "Magnetometer", "Thermal Sensor", 409, false, "Active", 89.1, "Trajectory-109");
                SpaceProbeDTO probe110 = new SpaceProbeDTO(110, "Mission-110", "Europa", "Boeing", 2100.0, LocalDateTime.of(2029, 2, 26, 10, 30), LocalDateTime.of(2031, 2, 26, 9, 15), "Solar Sail", 2550.0, "X-Band", 12000000.0, 21.0, "Thermal Sensor", "Camera", 410, true, "Completed", 89.0, "Trajectory-110");
                SpaceProbeDTO probe111 = new SpaceProbeDTO(111, "Mission-111", "Mars", "NASA", 2110.0, LocalDateTime.of(2020, 3, 27, 10, 30), LocalDateTime.of(2022, 3, 27, 9, 15), "Chemical", 2555.0, "X-Band", 12100000.0, 21.1, "Camera", "Spectrometer", 411, false, "Standby", 88.9, "Trajectory-111");
                SpaceProbeDTO probe112 = new SpaceProbeDTO(112, "Mission-112", "Venus", "ISRO", 2120.0, LocalDateTime.of(2021, 4, 28, 10, 30), LocalDateTime.of(2023, 4, 28, 9, 15), "Ion", 2560.0, "X-Band", 12200000.0, 21.2, "Spectrometer", "Radar", 412, true, "Planned", 88.8, "Trajectory-112");
                SpaceProbeDTO probe113 = new SpaceProbeDTO(113, "Mission-113", "Jupiter", "ESA", 2130.0, LocalDateTime.of(2022, 5, 1, 10, 30), LocalDateTime.of(2024, 5, 1, 9, 15), "Nuclear", 2565.0, "X-Band", 12300000.0, 21.3, "Radar", "Magnetometer", 413, false, "Active", 88.7, "Trajectory-113");
                SpaceProbeDTO probe114 = new SpaceProbeDTO(114, "Mission-114", "Saturn", "JAXA", 2140.0, LocalDateTime.of(2023, 6, 2, 10, 30), LocalDateTime.of(2025, 6, 2, 9, 15), "Electric", 2570.0, "X-Band", 12400000.0, 21.4, "Magnetometer", "Thermal Sensor", 414, true, "Completed", 88.6, "Trajectory-114");
                SpaceProbeDTO probe115 = new SpaceProbeDTO(115, "Mission-115", "Mercury", "CNSA", 2150.0, LocalDateTime.of(2024, 7, 3, 10, 30), LocalDateTime.of(2026, 7, 3, 9, 15), "Solar Sail", 2575.0, "X-Band", 12500000.0, 21.5, "Thermal Sensor", "Camera", 415, false, "Standby", 88.5, "Trajectory-115");
                SpaceProbeDTO probe116 = new SpaceProbeDTO(116, "Mission-116", "Neptune", "SpaceX", 2160.0, LocalDateTime.of(2025, 8, 4, 10, 30), LocalDateTime.of(2027, 8, 4, 9, 15), "Chemical", 2580.0, "X-Band", 12600000.0, 21.6, "Camera", "Spectrometer", 416, true, "Planned", 88.4, "Trajectory-116");
                SpaceProbeDTO probe117 = new SpaceProbeDTO(117, "Mission-117", "Uranus", "Roscosmos", 2170.0, LocalDateTime.of(2026, 9, 5, 10, 30), LocalDateTime.of(2028, 9, 5, 9, 15), "Ion", 2585.0, "X-Band", 12700000.0, 21.7, "Spectrometer", "Radar", 417, false, "Active", 88.3, "Trajectory-117");
                SpaceProbeDTO probe118 = new SpaceProbeDTO(118, "Mission-118", "Pluto", "BlueOrigin", 2180.0, LocalDateTime.of(2027, 10, 6, 10, 30), LocalDateTime.of(2029, 10, 6, 9, 15), "Nuclear", 2590.0, "X-Band", 12800000.0, 21.8, "Radar", "Magnetometer", 418, true, "Completed", 88.2, "Trajectory-118");
                SpaceProbeDTO probe119 = new SpaceProbeDTO(119, "Mission-119", "Moon", "ULA", 2190.0, LocalDateTime.of(2028, 11, 7, 10, 30), LocalDateTime.of(2030, 11, 7, 9, 15), "Electric", 2595.0, "X-Band", 12900000.0, 21.9, "Magnetometer", "Thermal Sensor", 419, false, "Standby", 88.1, "Trajectory-119");
                SpaceProbeDTO probe120 = new SpaceProbeDTO(120, "Mission-120", "Europa", "Boeing", 2200.0, LocalDateTime.of(2029, 12, 8, 10, 30), LocalDateTime.of(2031, 12, 8, 9, 15), "Solar Sail", 2600.0, "X-Band", 13000000.0, 22.0, "Thermal Sensor", "Camera", 420, true, "Planned", 88.0, "Trajectory-120");
                SpaceProbeDTO probe121 = new SpaceProbeDTO(121, "Mission-121", "Mars", "NASA", 2210.0, LocalDateTime.of(2020, 1, 9, 10, 30), LocalDateTime.of(2022, 1, 9, 9, 15), "Chemical", 2605.0, "X-Band", 13100000.0, 22.1, "Camera", "Spectrometer", 421, false, "Active", 87.9, "Trajectory-121");
                SpaceProbeDTO probe122 = new SpaceProbeDTO(122, "Mission-122", "Venus", "ISRO", 2220.0, LocalDateTime.of(2021, 2, 10, 10, 30), LocalDateTime.of(2023, 2, 10, 9, 15), "Ion", 2610.0, "X-Band", 13200000.0, 22.2, "Spectrometer", "Radar", 422, true, "Completed", 87.8, "Trajectory-122");
                SpaceProbeDTO probe123 = new SpaceProbeDTO(123, "Mission-123", "Jupiter", "ESA", 2230.0, LocalDateTime.of(2022, 3, 11, 10, 30), LocalDateTime.of(2024, 3, 11, 9, 15), "Nuclear", 2615.0, "X-Band", 13300000.0, 22.3, "Radar", "Magnetometer", 423, false, "Standby", 87.7, "Trajectory-123");
                SpaceProbeDTO probe124 = new SpaceProbeDTO(124, "Mission-124", "Saturn", "JAXA", 2240.0, LocalDateTime.of(2023, 4, 12, 10, 30), LocalDateTime.of(2025, 4, 12, 9, 15), "Electric", 2620.0, "X-Band", 13400000.0, 22.4, "Magnetometer", "Thermal Sensor", 424, true, "Planned", 87.6, "Trajectory-124");
                SpaceProbeDTO probe125 = new SpaceProbeDTO(125, "Mission-125", "Mercury", "CNSA", 2250.0, LocalDateTime.of(2024, 5, 13, 10, 30), LocalDateTime.of(2026, 5, 13, 9, 15), "Solar Sail", 2625.0, "X-Band", 13500000.0, 22.5, "Thermal Sensor", "Camera", 425, false, "Active", 87.5, "Trajectory-125");
                SpaceProbeDTO probe126 = new SpaceProbeDTO(126, "Mission-126", "Neptune", "SpaceX", 2260.0, LocalDateTime.of(2025, 6, 14, 10, 30), LocalDateTime.of(2027, 6, 14, 9, 15), "Chemical", 2630.0, "X-Band", 13600000.0, 22.6, "Camera", "Spectrometer", 426, true, "Completed", 87.4, "Trajectory-126");
                SpaceProbeDTO probe127 = new SpaceProbeDTO(127, "Mission-127", "Uranus", "Roscosmos", 2270.0, LocalDateTime.of(2026, 7, 15, 10, 30), LocalDateTime.of(2028, 7, 15, 9, 15), "Ion", 2635.0, "X-Band", 13700000.0, 22.7, "Spectrometer", "Radar", 427, false, "Standby", 87.3, "Trajectory-127");
                SpaceProbeDTO probe128 = new SpaceProbeDTO(128, "Mission-128", "Pluto", "BlueOrigin", 2280.0, LocalDateTime.of(2027, 8, 16, 10, 30), LocalDateTime.of(2029, 8, 16, 9, 15), "Nuclear", 2640.0, "X-Band", 13800000.0, 22.8, "Radar", "Magnetometer", 428, true, "Planned", 87.2, "Trajectory-128");
                SpaceProbeDTO probe129 = new SpaceProbeDTO(129, "Mission-129", "Moon", "ULA", 2290.0, LocalDateTime.of(2028, 9, 17, 10, 30), LocalDateTime.of(2030, 9, 17, 9, 15), "Electric", 2645.0, "X-Band", 13900000.0, 22.9, "Magnetometer", "Thermal Sensor", 429, false, "Active", 87.1, "Trajectory-129");
                SpaceProbeDTO probe130 = new SpaceProbeDTO(130, "Mission-130", "Europa", "Boeing", 2300.0, LocalDateTime.of(2029, 10, 18, 10, 30), LocalDateTime.of(2031, 10, 18, 9, 15), "Solar Sail", 2650.0, "X-Band", 14000000.0, 23.0, "Thermal Sensor", "Camera", 430, true, "Completed", 87.0, "Trajectory-130");
                SpaceProbeDTO probe131 = new SpaceProbeDTO(131, "Mission-131", "Mars", "NASA", 2310.0, LocalDateTime.of(2020, 11, 19, 10, 30), LocalDateTime.of(2022, 11, 19, 9, 15), "Chemical", 2655.0, "X-Band", 14100000.0, 23.1, "Camera", "Spectrometer", 431, false, "Standby", 86.9, "Trajectory-131");
                SpaceProbeDTO probe132 = new SpaceProbeDTO(132, "Mission-132", "Venus", "ISRO", 2320.0, LocalDateTime.of(2021, 12, 20, 10, 30), LocalDateTime.of(2023, 12, 20, 9, 15), "Ion", 2660.0, "X-Band", 14200000.0, 23.2, "Spectrometer", "Radar", 432, true, "Planned", 86.8, "Trajectory-132");
                SpaceProbeDTO probe133 = new SpaceProbeDTO(133, "Mission-133", "Jupiter", "ESA", 2330.0, LocalDateTime.of(2022, 1, 21, 10, 30), LocalDateTime.of(2024, 1, 21, 9, 15), "Nuclear", 2665.0, "X-Band", 14300000.0, 23.3, "Radar", "Magnetometer", 433, false, "Active", 86.7, "Trajectory-133");
                SpaceProbeDTO probe134 = new SpaceProbeDTO(134, "Mission-134", "Saturn", "JAXA", 2340.0, LocalDateTime.of(2023, 2, 22, 10, 30), LocalDateTime.of(2025, 2, 22, 9, 15), "Electric", 2670.0, "X-Band", 14400000.0, 23.4, "Magnetometer", "Thermal Sensor", 434, true, "Completed", 86.6, "Trajectory-134");
                SpaceProbeDTO probe135 = new SpaceProbeDTO(135, "Mission-135", "Mercury", "CNSA", 2350.0, LocalDateTime.of(2024, 3, 23, 10, 30), LocalDateTime.of(2026, 3, 23, 9, 15), "Solar Sail", 2675.0, "X-Band", 14500000.0, 23.5, "Thermal Sensor", "Camera", 435, false, "Standby", 86.5, "Trajectory-135");
                SpaceProbeDTO probe136 = new SpaceProbeDTO(136, "Mission-136", "Neptune", "SpaceX", 2360.0, LocalDateTime.of(2025, 4, 24, 10, 30), LocalDateTime.of(2027, 4, 24, 9, 15), "Chemical", 2680.0, "X-Band", 14600000.0, 23.6, "Camera", "Spectrometer", 436, true, "Planned", 86.4, "Trajectory-136");
                SpaceProbeDTO probe137 = new SpaceProbeDTO(137, "Mission-137", "Uranus", "Roscosmos", 2370.0, LocalDateTime.of(2026, 5, 25, 10, 30), LocalDateTime.of(2028, 5, 25, 9, 15), "Ion", 2685.0, "X-Band", 14700000.0, 23.7, "Spectrometer", "Radar", 437, false, "Active", 86.3, "Trajectory-137");
                SpaceProbeDTO probe138 = new SpaceProbeDTO(138, "Mission-138", "Pluto", "BlueOrigin", 2380.0, LocalDateTime.of(2027, 6, 26, 10, 30), LocalDateTime.of(2029, 6, 26, 9, 15), "Nuclear", 2690.0, "X-Band", 14800000.0, 23.8, "Radar", "Magnetometer", 438, true, "Completed", 86.2, "Trajectory-138");
                SpaceProbeDTO probe139 = new SpaceProbeDTO(139, "Mission-139", "Moon", "ULA", 2390.0, LocalDateTime.of(2028, 7, 27, 10, 30), LocalDateTime.of(2030, 7, 27, 9, 15), "Electric", 2695.0, "X-Band", 14900000.0, 23.9, "Magnetometer", "Thermal Sensor", 439, false, "Standby", 86.1, "Trajectory-139");
                SpaceProbeDTO probe140 = new SpaceProbeDTO(140, "Mission-140", "Europa", "Boeing", 2400.0, LocalDateTime.of(2029, 8, 28, 10, 30), LocalDateTime.of(2031, 8, 28, 9, 15), "Solar Sail", 2700.0, "X-Band", 15000000.0, 24.0, "Thermal Sensor", "Camera", 440, true, "Planned", 86.0, "Trajectory-140");
                SpaceProbeDTO probe141 = new SpaceProbeDTO(141, "Mission-141", "Mars", "NASA", 2410.0, LocalDateTime.of(2020, 9, 1, 10, 30), LocalDateTime.of(2022, 9, 1, 9, 15), "Chemical", 2705.0, "X-Band", 15100000.0, 24.1, "Camera", "Spectrometer", 441, false, "Active", 85.9, "Trajectory-141");
                SpaceProbeDTO probe142 = new SpaceProbeDTO(142, "Mission-142", "Venus", "ISRO", 2420.0, LocalDateTime.of(2021, 10, 2, 10, 30), LocalDateTime.of(2023, 10, 2, 9, 15), "Ion", 2710.0, "X-Band", 15200000.0, 24.2, "Spectrometer", "Radar", 442, true, "Completed", 85.8, "Trajectory-142");
                SpaceProbeDTO probe143 = new SpaceProbeDTO(143, "Mission-143", "Jupiter", "ESA", 2430.0, LocalDateTime.of(2022, 11, 3, 10, 30), LocalDateTime.of(2024, 11, 3, 9, 15), "Nuclear", 2715.0, "X-Band", 15300000.0, 24.3, "Radar", "Magnetometer", 443, false, "Standby", 85.7, "Trajectory-143");
                SpaceProbeDTO probe144 = new SpaceProbeDTO(144, "Mission-144", "Saturn", "JAXA", 2440.0, LocalDateTime.of(2023, 12, 4, 10, 30), LocalDateTime.of(2025, 12, 4, 9, 15), "Electric", 2720.0, "X-Band", 15400000.0, 24.4, "Magnetometer", "Thermal Sensor", 444, true, "Planned", 85.6, "Trajectory-144");
                SpaceProbeDTO probe145 = new SpaceProbeDTO(145, "Mission-145", "Mercury", "CNSA", 2450.0, LocalDateTime.of(2024, 1, 5, 10, 30), LocalDateTime.of(2026, 1, 5, 9, 15), "Solar Sail", 2725.0, "X-Band", 15500000.0, 24.5, "Thermal Sensor", "Camera", 445, false, "Active", 85.5, "Trajectory-145");
                SpaceProbeDTO probe146 = new SpaceProbeDTO(146, "Mission-146", "Neptune", "SpaceX", 2460.0, LocalDateTime.of(2025, 2, 6, 10, 30), LocalDateTime.of(2027, 2, 6, 9, 15), "Chemical", 2730.0, "X-Band", 15600000.0, 24.6, "Camera", "Spectrometer", 446, true, "Completed", 85.4, "Trajectory-146");
                SpaceProbeDTO probe147 = new SpaceProbeDTO(147, "Mission-147", "Uranus", "Roscosmos", 2470.0, LocalDateTime.of(2026, 3, 7, 10, 30), LocalDateTime.of(2028, 3, 7, 9, 15), "Ion", 2735.0, "X-Band", 15700000.0, 24.7, "Spectrometer", "Radar", 447, false, "Standby", 85.3, "Trajectory-147");
                SpaceProbeDTO probe148 = new SpaceProbeDTO(148, "Mission-148", "Pluto", "BlueOrigin", 2480.0, LocalDateTime.of(2027, 4, 8, 10, 30), LocalDateTime.of(2029, 4, 8, 9, 15), "Nuclear", 2740.0, "X-Band", 15800000.0, 24.8, "Radar", "Magnetometer", 448, true, "Planned", 85.2, "Trajectory-148");
                SpaceProbeDTO probe149 = new SpaceProbeDTO(149, "Mission-149", "Moon", "ULA", 2490.0, LocalDateTime.of(2028, 5, 9, 10, 30), LocalDateTime.of(2030, 5, 9, 9, 15), "Electric", 2745.0, "X-Band", 15900000.0, 24.9, "Magnetometer", "Thermal Sensor", 449, false, "Active", 85.1, "Trajectory-149");
                SpaceProbeDTO probe150 = new SpaceProbeDTO(150, "Mission-150", "Europa", "Boeing", 2500.0, LocalDateTime.of(2029, 6, 10, 10, 30), LocalDateTime.of(2031, 6, 10, 9, 15), "Solar Sail", 2750.0, "X-Band", 16000000.0, 25.0, "Thermal Sensor", "Camera", 450, true, "Completed", 85.0, "Trajectory-150");
                SpaceProbeDTO probe151 = new SpaceProbeDTO(151, "Mission-151", "Mars", "NASA", 2510.0, LocalDateTime.of(2020, 7, 11, 10, 30), LocalDateTime.of(2022, 7, 11, 9, 15), "Chemical", 2755.0, "X-Band", 16100000.0, 25.1, "Camera", "Spectrometer", 451, false, "Standby", 84.9, "Trajectory-151");
                SpaceProbeDTO probe152 = new SpaceProbeDTO(152, "Mission-152", "Venus", "ISRO", 2520.0, LocalDateTime.of(2021, 8, 12, 10, 30), LocalDateTime.of(2023, 8, 12, 9, 15), "Ion", 2760.0, "X-Band", 16200000.0, 25.2, "Spectrometer", "Radar", 452, true, "Planned", 84.8, "Trajectory-152");
                SpaceProbeDTO probe153 = new SpaceProbeDTO(153, "Mission-153", "Jupiter", "ESA", 2530.0, LocalDateTime.of(2022, 9, 13, 10, 30), LocalDateTime.of(2024, 9, 13, 9, 15), "Nuclear", 2765.0, "X-Band", 16300000.0, 25.3, "Radar", "Magnetometer", 453, false, "Active", 84.7, "Trajectory-153");
                SpaceProbeDTO probe154 = new SpaceProbeDTO(154, "Mission-154", "Saturn", "JAXA", 2540.0, LocalDateTime.of(2023, 10, 14, 10, 30), LocalDateTime.of(2025, 10, 14, 9, 15), "Electric", 2770.0, "X-Band", 16400000.0, 25.4, "Magnetometer", "Thermal Sensor", 454, true, "Completed", 84.6, "Trajectory-154");
                SpaceProbeDTO probe155 = new SpaceProbeDTO(155, "Mission-155", "Mercury", "CNSA", 2550.0, LocalDateTime.of(2024, 11, 15, 10, 30), LocalDateTime.of(2026, 11, 15, 9, 15), "Solar Sail", 2775.0, "X-Band", 16500000.0, 25.5, "Thermal Sensor", "Camera", 455, false, "Standby", 84.5, "Trajectory-155");
                SpaceProbeDTO probe156 = new SpaceProbeDTO(156, "Mission-156", "Neptune", "SpaceX", 2560.0, LocalDateTime.of(2025, 12, 16, 10, 30), LocalDateTime.of(2027, 12, 16, 9, 15), "Chemical", 2780.0, "X-Band", 16600000.0, 25.6, "Camera", "Spectrometer", 456, true, "Planned", 84.4, "Trajectory-156");
                SpaceProbeDTO probe157 = new SpaceProbeDTO(157, "Mission-157", "Uranus", "Roscosmos", 2570.0, LocalDateTime.of(2026, 1, 17, 10, 30), LocalDateTime.of(2028, 1, 17, 9, 15), "Ion", 2785.0, "X-Band", 16700000.0, 25.7, "Spectrometer", "Radar", 457, false, "Active", 84.3, "Trajectory-157");
                SpaceProbeDTO probe158 = new SpaceProbeDTO(158, "Mission-158", "Pluto", "BlueOrigin", 2580.0, LocalDateTime.of(2027, 2, 18, 10, 30), LocalDateTime.of(2029, 2, 18, 9, 15), "Nuclear", 2790.0, "X-Band", 16800000.0, 25.8, "Radar", "Magnetometer", 458, true, "Completed", 84.2, "Trajectory-158");
                SpaceProbeDTO probe159 = new SpaceProbeDTO(159, "Mission-159", "Moon", "ULA", 2590.0, LocalDateTime.of(2028, 3, 19, 10, 30), LocalDateTime.of(2030, 3, 19, 9, 15), "Electric", 2795.0, "X-Band", 16900000.0, 25.9, "Magnetometer", "Thermal Sensor", 459, false, "Standby", 84.1, "Trajectory-159");
                SpaceProbeDTO probe160 = new SpaceProbeDTO(160, "Mission-160", "Europa", "Boeing", 2600.0, LocalDateTime.of(2029, 4, 20, 10, 30), LocalDateTime.of(2031, 4, 20, 9, 15), "Solar Sail", 2800.0, "X-Band", 17000000.0, 26.0, "Thermal Sensor", "Camera", 460, true, "Planned", 84.0, "Trajectory-160");
                SpaceProbeDTO probe161 = new SpaceProbeDTO(161, "Mission-161", "Mars", "NASA", 2610.0, LocalDateTime.of(2020, 5, 21, 10, 30), LocalDateTime.of(2022, 5, 21, 9, 15), "Chemical", 2805.0, "X-Band", 17100000.0, 26.1, "Camera", "Spectrometer", 461, false, "Active", 83.9, "Trajectory-161");
                SpaceProbeDTO probe162 = new SpaceProbeDTO(162, "Mission-162", "Venus", "ISRO", 2620.0, LocalDateTime.of(2021, 6, 22, 10, 30), LocalDateTime.of(2023, 6, 22, 9, 15), "Ion", 2810.0, "X-Band", 17200000.0, 26.2, "Spectrometer", "Radar", 462, true, "Completed", 83.8, "Trajectory-162");
                SpaceProbeDTO probe163 = new SpaceProbeDTO(163, "Mission-163", "Jupiter", "ESA", 2630.0, LocalDateTime.of(2022, 7, 23, 10, 30), LocalDateTime.of(2024, 7, 23, 9, 15), "Nuclear", 2815.0, "X-Band", 17300000.0, 26.3, "Radar", "Magnetometer", 463, false, "Standby", 83.7, "Trajectory-163");
                SpaceProbeDTO probe164 = new SpaceProbeDTO(164, "Mission-164", "Saturn", "JAXA", 2640.0, LocalDateTime.of(2023, 8, 24, 10, 30), LocalDateTime.of(2025, 8, 24, 9, 15), "Electric", 2820.0, "X-Band", 17400000.0, 26.4, "Magnetometer", "Thermal Sensor", 464, true, "Planned", 83.6, "Trajectory-164");
                SpaceProbeDTO probe165 = new SpaceProbeDTO(165, "Mission-165", "Mercury", "CNSA", 2650.0, LocalDateTime.of(2024, 9, 25, 10, 30), LocalDateTime.of(2026, 9, 25, 9, 15), "Solar Sail", 2825.0, "X-Band", 17500000.0, 26.5, "Thermal Sensor", "Camera", 465, false, "Active", 83.5, "Trajectory-165");
                SpaceProbeDTO probe166 = new SpaceProbeDTO(166, "Mission-166", "Neptune", "SpaceX", 2660.0, LocalDateTime.of(2025, 10, 26, 10, 30), LocalDateTime.of(2027, 10, 26, 9, 15), "Chemical", 2830.0, "X-Band", 17600000.0, 26.6, "Camera", "Spectrometer", 466, true, "Completed", 83.4, "Trajectory-166");
                SpaceProbeDTO probe167 = new SpaceProbeDTO(167, "Mission-167", "Uranus", "Roscosmos", 2670.0, LocalDateTime.of(2026, 11, 27, 10, 30), LocalDateTime.of(2028, 11, 27, 9, 15), "Ion", 2835.0, "X-Band", 17700000.0, 26.7, "Spectrometer", "Radar", 467, false, "Standby", 83.3, "Trajectory-167");
                SpaceProbeDTO probe168 = new SpaceProbeDTO(168, "Mission-168", "Pluto", "BlueOrigin", 2680.0, LocalDateTime.of(2027, 12, 28, 10, 30), LocalDateTime.of(2029, 12, 28, 9, 15), "Nuclear", 2840.0, "X-Band", 17800000.0, 26.8, "Radar", "Magnetometer", 468, true, "Planned", 83.2, "Trajectory-168");
                SpaceProbeDTO probe169 = new SpaceProbeDTO(169, "Mission-169", "Moon", "ULA", 2690.0, LocalDateTime.of(2028, 1, 1, 10, 30), LocalDateTime.of(2030, 1, 1, 9, 15), "Electric", 2845.0, "X-Band", 17900000.0, 26.9, "Magnetometer", "Thermal Sensor", 469, false, "Active", 83.1, "Trajectory-169");
                SpaceProbeDTO probe170 = new SpaceProbeDTO(170, "Mission-170", "Europa", "Boeing", 2700.0, LocalDateTime.of(2029, 2, 2, 10, 30), LocalDateTime.of(2031, 2, 2, 9, 15), "Solar Sail", 2850.0, "X-Band", 18000000.0, 27.0, "Thermal Sensor", "Camera", 470, true, "Completed", 83.0, "Trajectory-170");
                SpaceProbeDTO probe171 = new SpaceProbeDTO(171, "Mission-171", "Mars", "NASA", 2710.0, LocalDateTime.of(2020, 3, 3, 10, 30), LocalDateTime.of(2022, 3, 3, 9, 15), "Chemical", 2855.0, "X-Band", 18100000.0, 27.1, "Camera", "Spectrometer", 471, false, "Standby", 82.9, "Trajectory-171");
                SpaceProbeDTO probe172 = new SpaceProbeDTO(172, "Mission-172", "Venus", "ISRO", 2720.0, LocalDateTime.of(2021, 4, 4, 10, 30), LocalDateTime.of(2023, 4, 4, 9, 15), "Ion", 2860.0, "X-Band", 18200000.0, 27.2, "Spectrometer", "Radar", 472, true, "Planned", 82.8, "Trajectory-172");
                SpaceProbeDTO probe173 = new SpaceProbeDTO(173, "Mission-173", "Jupiter", "ESA", 2730.0, LocalDateTime.of(2022, 5, 5, 10, 30), LocalDateTime.of(2024, 5, 5, 9, 15), "Nuclear", 2865.0, "X-Band", 18300000.0, 27.3, "Radar", "Magnetometer", 473, false, "Active", 82.7, "Trajectory-173");
                SpaceProbeDTO probe174 = new SpaceProbeDTO(174, "Mission-174", "Saturn", "JAXA", 2740.0, LocalDateTime.of(2023, 6, 6, 10, 30), LocalDateTime.of(2025, 6, 6, 9, 15), "Electric", 2870.0, "X-Band", 18400000.0, 27.4, "Magnetometer", "Thermal Sensor", 474, true, "Completed", 82.6, "Trajectory-174");
                SpaceProbeDTO probe175 = new SpaceProbeDTO(175, "Mission-175", "Mercury", "CNSA", 2750.0, LocalDateTime.of(2024, 7, 7, 10, 30), LocalDateTime.of(2026, 7, 7, 9, 15), "Solar Sail", 2875.0, "X-Band", 18500000.0, 27.5, "Thermal Sensor", "Camera", 475, false, "Standby", 82.5, "Trajectory-175");
                SpaceProbeDTO probe176 = new SpaceProbeDTO(176, "Mission-176", "Neptune", "SpaceX", 2760.0, LocalDateTime.of(2025, 8, 8, 10, 30), LocalDateTime.of(2027, 8, 8, 9, 15), "Chemical", 2880.0, "X-Band", 18600000.0, 27.6, "Camera", "Spectrometer", 476, true, "Planned", 82.4, "Trajectory-176");
                SpaceProbeDTO probe177 = new SpaceProbeDTO(177, "Mission-177", "Uranus", "Roscosmos", 2770.0, LocalDateTime.of(2026, 9, 9, 10, 30), LocalDateTime.of(2028, 9, 9, 9, 15), "Ion", 2885.0, "X-Band", 18700000.0, 27.7, "Spectrometer", "Radar", 477, false, "Active", 82.3, "Trajectory-177");
                SpaceProbeDTO probe178 = new SpaceProbeDTO(178, "Mission-178", "Pluto", "BlueOrigin", 2780.0, LocalDateTime.of(2027, 10, 10, 10, 30), LocalDateTime.of(2029, 10, 10, 9, 15), "Nuclear", 2890.0, "X-Band", 18800000.0, 27.8, "Radar", "Magnetometer", 478, true, "Completed", 82.2, "Trajectory-178");
                SpaceProbeDTO probe179 = new SpaceProbeDTO(179, "Mission-179", "Moon", "ULA", 2790.0, LocalDateTime.of(2028, 11, 11, 10, 30), LocalDateTime.of(2030, 11, 11, 9, 15), "Electric", 2895.0, "X-Band", 18900000.0, 27.9, "Magnetometer", "Thermal Sensor", 479, false, "Standby", 82.1, "Trajectory-179");
                SpaceProbeDTO probe180 = new SpaceProbeDTO(180, "Mission-180", "Europa", "Boeing", 2800.0, LocalDateTime.of(2029, 12, 12, 10, 30), LocalDateTime.of(2031, 12, 12, 9, 15), "Solar Sail", 2900.0, "X-Band", 19000000.0, 28.0, "Thermal Sensor", "Camera", 480, true, "Planned", 82.0, "Trajectory-180");
                SpaceProbeDTO probe181 = new SpaceProbeDTO(181, "Mission-181", "Mars", "NASA", 2810.0, LocalDateTime.of(2020, 1, 13, 10, 30), LocalDateTime.of(2022, 1, 13, 9, 15), "Chemical", 2905.0, "X-Band", 19100000.0, 28.1, "Camera", "Spectrometer", 481, false, "Active", 81.9, "Trajectory-181");
                SpaceProbeDTO probe182 = new SpaceProbeDTO(182, "Mission-182", "Venus", "ISRO", 2820.0, LocalDateTime.of(2021, 2, 14, 10, 30), LocalDateTime.of(2023, 2, 14, 9, 15), "Ion", 2910.0, "X-Band", 19200000.0, 28.2, "Spectrometer", "Radar", 482, true, "Completed", 81.8, "Trajectory-182");
                SpaceProbeDTO probe183 = new SpaceProbeDTO(183, "Mission-183", "Jupiter", "ESA", 2830.0, LocalDateTime.of(2022, 3, 15, 10, 30), LocalDateTime.of(2024, 3, 15, 9, 15), "Nuclear", 2915.0, "X-Band", 19300000.0, 28.3, "Radar", "Magnetometer", 483, false, "Standby", 81.7, "Trajectory-183");
                SpaceProbeDTO probe184 = new SpaceProbeDTO(184, "Mission-184", "Saturn", "JAXA", 2840.0, LocalDateTime.of(2023, 4, 16, 10, 30), LocalDateTime.of(2025, 4, 16, 9, 15), "Electric", 2920.0, "X-Band", 19400000.0, 28.4, "Magnetometer", "Thermal Sensor", 484, true, "Planned", 81.6, "Trajectory-184");
                SpaceProbeDTO probe185 = new SpaceProbeDTO(185, "Mission-185", "Mercury", "CNSA", 2850.0, LocalDateTime.of(2024, 5, 17, 10, 30), LocalDateTime.of(2026, 5, 17, 9, 15), "Solar Sail", 2925.0, "X-Band", 19500000.0, 28.5, "Thermal Sensor", "Camera", 485, false, "Active", 81.5, "Trajectory-185");
                SpaceProbeDTO probe186 = new SpaceProbeDTO(186, "Mission-186", "Neptune", "SpaceX", 2860.0, LocalDateTime.of(2025, 6, 18, 10, 30), LocalDateTime.of(2027, 6, 18, 9, 15), "Chemical", 2930.0, "X-Band", 19600000.0, 28.6, "Camera", "Spectrometer", 486, true, "Completed", 81.4, "Trajectory-186");
                SpaceProbeDTO probe187 = new SpaceProbeDTO(187, "Mission-187", "Uranus", "Roscosmos", 2870.0, LocalDateTime.of(2026, 7, 19, 10, 30), LocalDateTime.of(2028, 7, 19, 9, 15), "Ion", 2935.0, "X-Band", 19700000.0, 28.7, "Spectrometer", "Radar", 487, false, "Standby", 81.3, "Trajectory-187");
                SpaceProbeDTO probe188 = new SpaceProbeDTO(188, "Mission-188", "Pluto", "BlueOrigin", 2880.0, LocalDateTime.of(2027, 8, 20, 10, 30), LocalDateTime.of(2029, 8, 20, 9, 15), "Nuclear", 2940.0, "X-Band", 19800000.0, 28.8, "Radar", "Magnetometer", 488, true, "Planned", 81.2, "Trajectory-188");
                SpaceProbeDTO probe189 = new SpaceProbeDTO(189, "Mission-189", "Moon", "ULA", 2890.0, LocalDateTime.of(2028, 9, 21, 10, 30), LocalDateTime.of(2030, 9, 21, 9, 15), "Electric", 2945.0, "X-Band", 19900000.0, 28.9, "Magnetometer", "Thermal Sensor", 489, false, "Active", 81.1, "Trajectory-189");
                SpaceProbeDTO probe190 = new SpaceProbeDTO(190, "Mission-190", "Europa", "Boeing", 2900.0, LocalDateTime.of(2029, 10, 22, 10, 30), LocalDateTime.of(2031, 10, 22, 9, 15), "Solar Sail", 2950.0, "X-Band", 20000000.0, 29.0, "Thermal Sensor", "Camera", 490, true, "Completed", 81.0, "Trajectory-190");
                SpaceProbeDTO probe191 = new SpaceProbeDTO(191, "Mission-191", "Mars", "NASA", 2910.0, LocalDateTime.of(2020, 11, 23, 10, 30), LocalDateTime.of(2022, 11, 23, 9, 15), "Chemical", 2955.0, "X-Band", 20100000.0, 29.1, "Camera", "Spectrometer", 491, false, "Standby", 80.9, "Trajectory-191");
                SpaceProbeDTO probe192 = new SpaceProbeDTO(192, "Mission-192", "Venus", "ISRO", 2920.0, LocalDateTime.of(2021, 12, 24, 10, 30), LocalDateTime.of(2023, 12, 24, 9, 15), "Ion", 2960.0, "X-Band", 20200000.0, 29.2, "Spectrometer", "Radar", 492, true, "Planned", 80.8, "Trajectory-192");
                SpaceProbeDTO probe193 = new SpaceProbeDTO(193, "Mission-193", "Jupiter", "ESA", 2930.0, LocalDateTime.of(2022, 1, 25, 10, 30), LocalDateTime.of(2024, 1, 25, 9, 15), "Nuclear", 2965.0, "X-Band", 20300000.0, 29.3, "Radar", "Magnetometer", 493, false, "Active", 80.7, "Trajectory-193");
                SpaceProbeDTO probe194 = new SpaceProbeDTO(194, "Mission-194", "Saturn", "JAXA", 2940.0, LocalDateTime.of(2023, 2, 26, 10, 30), LocalDateTime.of(2025, 2, 26, 9, 15), "Electric", 2970.0, "X-Band", 20400000.0, 29.4, "Magnetometer", "Thermal Sensor", 494, true, "Completed", 80.6, "Trajectory-194");
                SpaceProbeDTO probe195 = new SpaceProbeDTO(195, "Mission-195", "Mercury", "CNSA", 2950.0, LocalDateTime.of(2024, 3, 27, 10, 30), LocalDateTime.of(2026, 3, 27, 9, 15), "Solar Sail", 2975.0, "X-Band", 20500000.0, 29.5, "Thermal Sensor", "Camera", 495, false, "Standby", 80.5, "Trajectory-195");
                SpaceProbeDTO probe196 = new SpaceProbeDTO(196, "Mission-196", "Neptune", "SpaceX", 2960.0, LocalDateTime.of(2025, 4, 28, 10, 30), LocalDateTime.of(2027, 4, 28, 9, 15), "Chemical", 2980.0, "X-Band", 20600000.0, 29.6, "Camera", "Spectrometer", 496, true, "Planned", 80.4, "Trajectory-196");
                SpaceProbeDTO probe197 = new SpaceProbeDTO(197, "Mission-197", "Uranus", "Roscosmos", 2970.0, LocalDateTime.of(2026, 5, 1, 10, 30), LocalDateTime.of(2028, 5, 1, 9, 15), "Ion", 2985.0, "X-Band", 20700000.0, 29.7, "Spectrometer", "Radar", 497, false, "Active", 80.3, "Trajectory-197");
                SpaceProbeDTO probe198 = new SpaceProbeDTO(198, "Mission-198", "Pluto", "BlueOrigin", 2980.0, LocalDateTime.of(2027, 6, 2, 10, 30), LocalDateTime.of(2029, 6, 2, 9, 15), "Nuclear", 2990.0, "X-Band", 20800000.0, 29.8, "Radar", "Magnetometer", 498, true, "Completed", 80.2, "Trajectory-198");
                SpaceProbeDTO probe199 = new SpaceProbeDTO(199, "Mission-199", "Moon", "ULA", 2990.0, LocalDateTime.of(2028, 7, 3, 10, 30), LocalDateTime.of(2030, 7, 3, 9, 15), "Electric", 2995.0, "X-Band", 20900000.0, 29.9, "Magnetometer", "Thermal Sensor", 499, false, "Standby", 80.1, "Trajectory-199");
                SpaceProbeDTO probe200 = new SpaceProbeDTO(200, "Mission-200", "Europa", "Boeing", 3000.0, LocalDateTime.of(2029, 8, 4, 10, 30), LocalDateTime.of(2031, 8, 4, 9, 15), "Solar Sail", 3000.0, "X-Band", 21000000.0, 30.0, "Thermal Sensor", "Camera", 500, true, "Planned", 80.0, "Trajectory-200");
                SpaceProbeDTO probe201 = new SpaceProbeDTO(201, "Mission-201", "Mars", "NASA", 3010.0, LocalDateTime.of(2020, 9, 5, 10, 30), LocalDateTime.of(2022, 9, 5, 9, 15), "Chemical", 3005.0, "X-Band", 21100000.0, 30.1, "Camera", "Spectrometer", 501, false, "Active", 79.9, "Trajectory-201");
                SpaceProbeDTO probe202 = new SpaceProbeDTO(202, "Mission-202", "Venus", "ISRO", 3020.0, LocalDateTime.of(2021, 10, 6, 10, 30), LocalDateTime.of(2023, 10, 6, 9, 15), "Ion", 3010.0, "X-Band", 21200000.0, 30.2, "Spectrometer", "Radar", 502, true, "Completed", 79.8, "Trajectory-202");
                SpaceProbeDTO probe203 = new SpaceProbeDTO(203, "Mission-203", "Jupiter", "ESA", 3030.0, LocalDateTime.of(2022, 11, 7, 10, 30), LocalDateTime.of(2024, 11, 7, 9, 15), "Nuclear", 3015.0, "X-Band", 21300000.0, 30.3, "Radar", "Magnetometer", 503, false, "Standby", 79.7, "Trajectory-203");
                SpaceProbeDTO probe204 = new SpaceProbeDTO(204, "Mission-204", "Saturn", "JAXA", 3040.0, LocalDateTime.of(2023, 12, 8, 10, 30), LocalDateTime.of(2025, 12, 8, 9, 15), "Electric", 3020.0, "X-Band", 21400000.0, 30.4, "Magnetometer", "Thermal Sensor", 504, true, "Planned", 79.6, "Trajectory-204");
                SpaceProbeDTO probe205 = new SpaceProbeDTO(205, "Mission-205", "Mercury", "CNSA", 3050.0, LocalDateTime.of(2024, 1, 9, 10, 30), LocalDateTime.of(2026, 1, 9, 9, 15), "Solar Sail", 3025.0, "X-Band", 21500000.0, 30.5, "Thermal Sensor", "Camera", 505, false, "Active", 79.5, "Trajectory-205");
                SpaceProbeDTO probe206 = new SpaceProbeDTO(206, "Mission-206", "Neptune", "SpaceX", 3060.0, LocalDateTime.of(2025, 2, 10, 10, 30), LocalDateTime.of(2027, 2, 10, 9, 15), "Chemical", 3030.0, "X-Band", 21600000.0, 30.6, "Camera", "Spectrometer", 506, true, "Completed", 79.4, "Trajectory-206");
                SpaceProbeDTO probe207 = new SpaceProbeDTO(207, "Mission-207", "Uranus", "Roscosmos", 3070.0, LocalDateTime.of(2026, 3, 11, 10, 30), LocalDateTime.of(2028, 3, 11, 9, 15), "Ion", 3035.0, "X-Band", 21700000.0, 30.7, "Spectrometer", "Radar", 507, false, "Standby", 79.3, "Trajectory-207");
                SpaceProbeDTO probe208 = new SpaceProbeDTO(208, "Mission-208", "Pluto", "BlueOrigin", 3080.0, LocalDateTime.of(2027, 4, 12, 10, 30), LocalDateTime.of(2029, 4, 12, 9, 15), "Nuclear", 3040.0, "X-Band", 21800000.0, 30.8, "Radar", "Magnetometer", 508, true, "Planned", 79.2, "Trajectory-208");
                SpaceProbeDTO probe209 = new SpaceProbeDTO(209, "Mission-209", "Moon", "ULA", 3090.0, LocalDateTime.of(2028, 5, 13, 10, 30), LocalDateTime.of(2030, 5, 13, 9, 15), "Electric", 3045.0, "X-Band", 21900000.0, 30.9, "Magnetometer", "Thermal Sensor", 509, false, "Active", 79.1, "Trajectory-209");
                SpaceProbeDTO probe210 = new SpaceProbeDTO(210, "Mission-210", "Europa", "Boeing", 3100.0, LocalDateTime.of(2029, 6, 14, 10, 30), LocalDateTime.of(2031, 6, 14, 9, 15), "Solar Sail", 3050.0, "X-Band", 22000000.0, 31.0, "Thermal Sensor", "Camera", 510, true, "Completed", 79.0, "Trajectory-210");
                SpaceProbeDTO probe211 = new SpaceProbeDTO(211, "Mission-211", "Mars", "NASA", 3110.0, LocalDateTime.of(2020, 7, 15, 10, 30), LocalDateTime.of(2022, 7, 15, 9, 15), "Chemical", 3055.0, "X-Band", 22100000.0, 31.1, "Camera", "Spectrometer", 511, false, "Standby", 78.9, "Trajectory-211");
                SpaceProbeDTO probe212 = new SpaceProbeDTO(212, "Mission-212", "Venus", "ISRO", 3120.0, LocalDateTime.of(2021, 8, 16, 10, 30), LocalDateTime.of(2023, 8, 16, 9, 15), "Ion", 3060.0, "X-Band", 22200000.0, 31.2, "Spectrometer", "Radar", 512, true, "Planned", 78.8, "Trajectory-212");
                SpaceProbeDTO probe213 = new SpaceProbeDTO(213, "Mission-213", "Jupiter", "ESA", 3130.0, LocalDateTime.of(2022, 9, 17, 10, 30), LocalDateTime.of(2024, 9, 17, 9, 15), "Nuclear", 3065.0, "X-Band", 22300000.0, 31.3, "Radar", "Magnetometer", 513, false, "Active", 78.7, "Trajectory-213");
                SpaceProbeDTO probe214 = new SpaceProbeDTO(214, "Mission-214", "Saturn", "JAXA", 3140.0, LocalDateTime.of(2023, 10, 18, 10, 30), LocalDateTime.of(2025, 10, 18, 9, 15), "Electric", 3070.0, "X-Band", 22400000.0, 31.4, "Magnetometer", "Thermal Sensor", 514, true, "Completed", 78.6, "Trajectory-214");
                SpaceProbeDTO probe215 = new SpaceProbeDTO(215, "Mission-215", "Mercury", "CNSA", 3150.0, LocalDateTime.of(2024, 11, 19, 10, 30), LocalDateTime.of(2026, 11, 19, 9, 15), "Solar Sail", 3075.0, "X-Band", 22500000.0, 31.5, "Thermal Sensor", "Camera", 515, false, "Standby", 78.5, "Trajectory-215");
                SpaceProbeDTO probe216 = new SpaceProbeDTO(216, "Mission-216", "Neptune", "SpaceX", 3160.0, LocalDateTime.of(2025, 12, 20, 10, 30), LocalDateTime.of(2027, 12, 20, 9, 15), "Chemical", 3080.0, "X-Band", 22600000.0, 31.6, "Camera", "Spectrometer", 516, true, "Planned", 78.4, "Trajectory-216");
                SpaceProbeDTO probe217 = new SpaceProbeDTO(217, "Mission-217", "Uranus", "Roscosmos", 3170.0, LocalDateTime.of(2026, 1, 21, 10, 30), LocalDateTime.of(2028, 1, 21, 9, 15), "Ion", 3085.0, "X-Band", 22700000.0, 31.7, "Spectrometer", "Radar", 517, false, "Active", 78.3, "Trajectory-217");
                SpaceProbeDTO probe218 = new SpaceProbeDTO(218, "Mission-218", "Pluto", "BlueOrigin", 3180.0, LocalDateTime.of(2027, 2, 22, 10, 30), LocalDateTime.of(2029, 2, 22, 9, 15), "Nuclear", 3090.0, "X-Band", 22800000.0, 31.8, "Radar", "Magnetometer", 518, true, "Completed", 78.2, "Trajectory-218");
                SpaceProbeDTO probe219 = new SpaceProbeDTO(219, "Mission-219", "Moon", "ULA", 3190.0, LocalDateTime.of(2028, 3, 23, 10, 30), LocalDateTime.of(2030, 3, 23, 9, 15), "Electric", 3095.0, "X-Band", 22900000.0, 31.9, "Magnetometer", "Thermal Sensor", 519, false, "Standby", 78.1, "Trajectory-219");
                SpaceProbeDTO probe220 = new SpaceProbeDTO(220, "Mission-220", "Europa", "Boeing", 3200.0, LocalDateTime.of(2029, 4, 24, 10, 30), LocalDateTime.of(2031, 4, 24, 9, 15), "Solar Sail", 3100.0, "X-Band", 23000000.0, 32.0, "Thermal Sensor", "Camera", 520, true, "Planned", 78.0, "Trajectory-220");
                SpaceProbeDTO probe221 = new SpaceProbeDTO(221, "Mission-221", "Mars", "NASA", 3210.0, LocalDateTime.of(2020, 5, 25, 10, 30), LocalDateTime.of(2022, 5, 25, 9, 15), "Chemical", 3105.0, "X-Band", 23100000.0, 32.1, "Camera", "Spectrometer", 521, false, "Active", 77.9, "Trajectory-221");
                SpaceProbeDTO probe222 = new SpaceProbeDTO(222, "Mission-222", "Venus", "ISRO", 3220.0, LocalDateTime.of(2021, 6, 26, 10, 30), LocalDateTime.of(2023, 6, 26, 9, 15), "Ion", 3110.0, "X-Band", 23200000.0, 32.2, "Spectrometer", "Radar", 522, true, "Completed", 77.8, "Trajectory-222");
                SpaceProbeDTO probe223 = new SpaceProbeDTO(223, "Mission-223", "Jupiter", "ESA", 3230.0, LocalDateTime.of(2022, 7, 27, 10, 30), LocalDateTime.of(2024, 7, 27, 9, 15), "Nuclear", 3115.0, "X-Band", 23300000.0, 32.3, "Radar", "Magnetometer", 523, false, "Standby", 77.7, "Trajectory-223");
                SpaceProbeDTO probe224 = new SpaceProbeDTO(224, "Mission-224", "Saturn", "JAXA", 3240.0, LocalDateTime.of(2023, 8, 28, 10, 30), LocalDateTime.of(2025, 8, 28, 9, 15), "Electric", 3120.0, "X-Band", 23400000.0, 32.4, "Magnetometer", "Thermal Sensor", 524, true, "Planned", 77.6, "Trajectory-224");
                SpaceProbeDTO probe225 = new SpaceProbeDTO(225, "Mission-225", "Mercury", "CNSA", 3250.0, LocalDateTime.of(2024, 9, 1, 10, 30), LocalDateTime.of(2026, 9, 1, 9, 15), "Solar Sail", 3125.0, "X-Band", 23500000.0, 32.5, "Thermal Sensor", "Camera", 525, false, "Active", 77.5, "Trajectory-225");
                SpaceProbeDTO probe226 = new SpaceProbeDTO(226, "Mission-226", "Neptune", "SpaceX", 3260.0, LocalDateTime.of(2025, 10, 2, 10, 30), LocalDateTime.of(2027, 10, 2, 9, 15), "Chemical", 3130.0, "X-Band", 23600000.0, 32.6, "Camera", "Spectrometer", 526, true, "Completed", 77.4, "Trajectory-226");
                SpaceProbeDTO probe227 = new SpaceProbeDTO(227, "Mission-227", "Uranus", "Roscosmos", 3270.0, LocalDateTime.of(2026, 11, 3, 10, 30), LocalDateTime.of(2028, 11, 3, 9, 15), "Ion", 3135.0, "X-Band", 23700000.0, 32.7, "Spectrometer", "Radar", 527, false, "Standby", 77.3, "Trajectory-227");
                SpaceProbeDTO probe228 = new SpaceProbeDTO(228, "Mission-228", "Pluto", "BlueOrigin", 3280.0, LocalDateTime.of(2027, 12, 4, 10, 30), LocalDateTime.of(2029, 12, 4, 9, 15), "Nuclear", 3140.0, "X-Band", 23800000.0, 32.8, "Radar", "Magnetometer", 528, true, "Planned", 77.2, "Trajectory-228");
                SpaceProbeDTO probe229 = new SpaceProbeDTO(229, "Mission-229", "Moon", "ULA", 3290.0, LocalDateTime.of(2028, 1, 5, 10, 30), LocalDateTime.of(2030, 1, 5, 9, 15), "Electric", 3145.0, "X-Band", 23900000.0, 32.9, "Magnetometer", "Thermal Sensor", 529, false, "Active", 77.1, "Trajectory-229");
                SpaceProbeDTO probe230 = new SpaceProbeDTO(230, "Mission-230", "Europa", "Boeing", 3300.0, LocalDateTime.of(2029, 2, 6, 10, 30), LocalDateTime.of(2031, 2, 6, 9, 15), "Solar Sail", 3150.0, "X-Band", 24000000.0, 33.0, "Thermal Sensor", "Camera", 530, true, "Completed", 77.0, "Trajectory-230");
                SpaceProbeDTO probe231 = new SpaceProbeDTO(231, "Mission-231", "Mars", "NASA", 3310.0, LocalDateTime.of(2020, 3, 7, 10, 30), LocalDateTime.of(2022, 3, 7, 9, 15), "Chemical", 3155.0, "X-Band", 24100000.0, 33.1, "Camera", "Spectrometer", 531, false, "Standby", 76.9, "Trajectory-231");
                SpaceProbeDTO probe232 = new SpaceProbeDTO(232, "Mission-232", "Venus", "ISRO", 3320.0, LocalDateTime.of(2021, 4, 8, 10, 30), LocalDateTime.of(2023, 4, 8, 9, 15), "Ion", 3160.0, "X-Band", 24200000.0, 33.2, "Spectrometer", "Radar", 532, true, "Planned", 76.8, "Trajectory-232");
                SpaceProbeDTO probe233 = new SpaceProbeDTO(233, "Mission-233", "Jupiter", "ESA", 3330.0, LocalDateTime.of(2022, 5, 9, 10, 30), LocalDateTime.of(2024, 5, 9, 9, 15), "Nuclear", 3165.0, "X-Band", 24300000.0, 33.3, "Radar", "Magnetometer", 533, false, "Active", 76.7, "Trajectory-233");
                SpaceProbeDTO probe234 = new SpaceProbeDTO(234, "Mission-234", "Saturn", "JAXA", 3340.0, LocalDateTime.of(2023, 6, 10, 10, 30), LocalDateTime.of(2025, 6, 10, 9, 15), "Electric", 3170.0, "X-Band", 24400000.0, 33.4, "Magnetometer", "Thermal Sensor", 534, true, "Completed", 76.6, "Trajectory-234");
                SpaceProbeDTO probe235 = new SpaceProbeDTO(235, "Mission-235", "Mercury", "CNSA", 3350.0, LocalDateTime.of(2024, 7, 11, 10, 30), LocalDateTime.of(2026, 7, 11, 9, 15), "Solar Sail", 3175.0, "X-Band", 24500000.0, 33.5, "Thermal Sensor", "Camera", 535, false, "Standby", 76.5, "Trajectory-235");
                SpaceProbeDTO probe236 = new SpaceProbeDTO(236, "Mission-236", "Neptune", "SpaceX", 3360.0, LocalDateTime.of(2025, 8, 12, 10, 30), LocalDateTime.of(2027, 8, 12, 9, 15), "Chemical", 3180.0, "X-Band", 24600000.0, 33.6, "Camera", "Spectrometer", 536, true, "Planned", 76.4, "Trajectory-236");
                SpaceProbeDTO probe237 = new SpaceProbeDTO(237, "Mission-237", "Uranus", "Roscosmos", 3370.0, LocalDateTime.of(2026, 9, 13, 10, 30), LocalDateTime.of(2028, 9, 13, 9, 15), "Ion", 3185.0, "X-Band", 24700000.0, 33.7, "Spectrometer", "Radar", 537, false, "Active", 76.3, "Trajectory-237");
                SpaceProbeDTO probe238 = new SpaceProbeDTO(238, "Mission-238", "Pluto", "BlueOrigin", 3380.0, LocalDateTime.of(2027, 10, 14, 10, 30), LocalDateTime.of(2029, 10, 14, 9, 15), "Nuclear", 3190.0, "X-Band", 24800000.0, 33.8, "Radar", "Magnetometer", 538, true, "Completed", 76.2, "Trajectory-238");
                SpaceProbeDTO probe239 = new SpaceProbeDTO(239, "Mission-239", "Moon", "ULA", 3390.0, LocalDateTime.of(2028, 11, 15, 10, 30), LocalDateTime.of(2030, 11, 15, 9, 15), "Electric", 3195.0, "X-Band", 24900000.0, 33.9, "Magnetometer", "Thermal Sensor", 539, false, "Standby", 76.1, "Trajectory-239");
                SpaceProbeDTO probe240 = new SpaceProbeDTO(240, "Mission-240", "Europa", "Boeing", 3400.0, LocalDateTime.of(2029, 12, 16, 10, 30), LocalDateTime.of(2031, 12, 16, 9, 15), "Solar Sail", 3200.0, "X-Band", 25000000.0, 34.0, "Thermal Sensor", "Camera", 540, true, "Planned", 76.0, "Trajectory-240");
                SpaceProbeDTO probe241 = new SpaceProbeDTO(241, "Mission-241", "Mars", "NASA", 3410.0, LocalDateTime.of(2020, 1, 17, 10, 30), LocalDateTime.of(2022, 1, 17, 9, 15), "Chemical", 3205.0, "X-Band", 25100000.0, 34.1, "Camera", "Spectrometer", 541, false, "Active", 75.9, "Trajectory-241");
                SpaceProbeDTO probe242 = new SpaceProbeDTO(242, "Mission-242", "Venus", "ISRO", 3420.0, LocalDateTime.of(2021, 2, 18, 10, 30), LocalDateTime.of(2023, 2, 18, 9, 15), "Ion", 3210.0, "X-Band", 25200000.0, 34.2, "Spectrometer", "Radar", 542, true, "Completed", 75.8, "Trajectory-242");
                SpaceProbeDTO probe243 = new SpaceProbeDTO(243, "Mission-243", "Jupiter", "ESA", 3430.0, LocalDateTime.of(2022, 3, 19, 10, 30), LocalDateTime.of(2024, 3, 19, 9, 15), "Nuclear", 3215.0, "X-Band", 25300000.0, 34.3, "Radar", "Magnetometer", 543, false, "Standby", 75.7, "Trajectory-243");
                SpaceProbeDTO probe244 = new SpaceProbeDTO(244, "Mission-244", "Saturn", "JAXA", 3440.0, LocalDateTime.of(2023, 4, 20, 10, 30), LocalDateTime.of(2025, 4, 20, 9, 15), "Electric", 3220.0, "X-Band", 25400000.0, 34.4, "Magnetometer", "Thermal Sensor", 544, true, "Planned", 75.6, "Trajectory-244");
                SpaceProbeDTO probe245 = new SpaceProbeDTO(245, "Mission-245", "Mercury", "CNSA", 3450.0, LocalDateTime.of(2024, 5, 21, 10, 30), LocalDateTime.of(2026, 5, 21, 9, 15), "Solar Sail", 3225.0, "X-Band", 25500000.0, 34.5, "Thermal Sensor", "Camera", 545, false, "Active", 75.5, "Trajectory-245");
                SpaceProbeDTO probe246 = new SpaceProbeDTO(246, "Mission-246", "Neptune", "SpaceX", 3460.0, LocalDateTime.of(2025, 6, 22, 10, 30), LocalDateTime.of(2027, 6, 22, 9, 15), "Chemical", 3230.0, "X-Band", 25600000.0, 34.6, "Camera", "Spectrometer", 546, true, "Completed", 75.4, "Trajectory-246");
                SpaceProbeDTO probe247 = new SpaceProbeDTO(247, "Mission-247", "Uranus", "Roscosmos", 3470.0, LocalDateTime.of(2026, 7, 23, 10, 30), LocalDateTime.of(2028, 7, 23, 9, 15), "Ion", 3235.0, "X-Band", 25700000.0, 34.7, "Spectrometer", "Radar", 547, false, "Standby", 75.3, "Trajectory-247");
                SpaceProbeDTO probe248 = new SpaceProbeDTO(248, "Mission-248", "Pluto", "BlueOrigin", 3480.0, LocalDateTime.of(2027, 8, 24, 10, 30), LocalDateTime.of(2029, 8, 24, 9, 15), "Nuclear", 3240.0, "X-Band", 25800000.0, 34.8, "Radar", "Magnetometer", 548, true, "Planned", 75.2, "Trajectory-248");
                SpaceProbeDTO probe249 = new SpaceProbeDTO(249, "Mission-249", "Moon", "ULA", 3490.0, LocalDateTime.of(2028, 9, 25, 10, 30), LocalDateTime.of(2030, 9, 25, 9, 15), "Electric", 3245.0, "X-Band", 25900000.0, 34.9, "Magnetometer", "Thermal Sensor", 549, false, "Active", 75.1, "Trajectory-249");
                SpaceProbeDTO probe250 = new SpaceProbeDTO(250, "Mission-250", "Europa", "Boeing", 3500.0, LocalDateTime.of(2029, 10, 26, 10, 30), LocalDateTime.of(2031, 10, 26, 9, 15), "Solar Sail", 3250.0, "X-Band", 26000000.0, 35.0, "Thermal Sensor", "Camera", 550, true, "Completed", 75.0, "Trajectory-250");
                SpaceProbeDTO probe251 = new SpaceProbeDTO(251, "Mission-251", "Mars", "NASA", 3510.0, LocalDateTime.of(2020, 11, 27, 10, 30), LocalDateTime.of(2022, 11, 27, 9, 15), "Chemical", 3255.0, "X-Band", 26100000.0, 35.1, "Camera", "Spectrometer", 551, false, "Standby", 74.9, "Trajectory-251");
                SpaceProbeDTO probe252 = new SpaceProbeDTO(252, "Mission-252", "Venus", "ISRO", 3520.0, LocalDateTime.of(2021, 12, 28, 10, 30), LocalDateTime.of(2023, 12, 28, 9, 15), "Ion", 3260.0, "X-Band", 26200000.0, 35.2, "Spectrometer", "Radar", 552, true, "Planned", 74.8, "Trajectory-252");
                SpaceProbeDTO probe253 = new SpaceProbeDTO(253, "Mission-253", "Jupiter", "ESA", 3530.0, LocalDateTime.of(2022, 1, 1, 10, 30), LocalDateTime.of(2024, 1, 1, 9, 15), "Nuclear", 3265.0, "X-Band", 26300000.0, 35.3, "Radar", "Magnetometer", 553, false, "Active", 74.7, "Trajectory-253");
                SpaceProbeDTO probe254 = new SpaceProbeDTO(254, "Mission-254", "Saturn", "JAXA", 3540.0, LocalDateTime.of(2023, 2, 2, 10, 30), LocalDateTime.of(2025, 2, 2, 9, 15), "Electric", 3270.0, "X-Band", 26400000.0, 35.4, "Magnetometer", "Thermal Sensor", 554, true, "Completed", 74.6, "Trajectory-254");
                SpaceProbeDTO probe255 = new SpaceProbeDTO(255, "Mission-255", "Mercury", "CNSA", 3550.0, LocalDateTime.of(2024, 3, 3, 10, 30), LocalDateTime.of(2026, 3, 3, 9, 15), "Solar Sail", 3275.0, "X-Band", 26500000.0, 35.5, "Thermal Sensor", "Camera", 555, false, "Standby", 74.5, "Trajectory-255");
                SpaceProbeDTO probe256 = new SpaceProbeDTO(256, "Mission-256", "Neptune", "SpaceX", 3560.0, LocalDateTime.of(2025, 4, 4, 10, 30), LocalDateTime.of(2027, 4, 4, 9, 15), "Chemical", 3280.0, "X-Band", 26600000.0, 35.6, "Camera", "Spectrometer", 556, true, "Planned", 74.4, "Trajectory-256");
                SpaceProbeDTO probe257 = new SpaceProbeDTO(257, "Mission-257", "Uranus", "Roscosmos", 3570.0, LocalDateTime.of(2026, 5, 5, 10, 30), LocalDateTime.of(2028, 5, 5, 9, 15), "Ion", 3285.0, "X-Band", 26700000.0, 35.7, "Spectrometer", "Radar", 557, false, "Active", 74.3, "Trajectory-257");
                SpaceProbeDTO probe258 = new SpaceProbeDTO(258, "Mission-258", "Pluto", "BlueOrigin", 3580.0, LocalDateTime.of(2027, 6, 6, 10, 30), LocalDateTime.of(2029, 6, 6, 9, 15), "Nuclear", 3290.0, "X-Band", 26800000.0, 35.8, "Radar", "Magnetometer", 558, true, "Completed", 74.2, "Trajectory-258");
                SpaceProbeDTO probe259 = new SpaceProbeDTO(259, "Mission-259", "Moon", "ULA", 3590.0, LocalDateTime.of(2028, 7, 7, 10, 30), LocalDateTime.of(2030, 7, 7, 9, 15), "Electric", 3295.0, "X-Band", 26900000.0, 35.9, "Magnetometer", "Thermal Sensor", 559, false, "Standby", 74.1, "Trajectory-259");
                SpaceProbeDTO probe260 = new SpaceProbeDTO(260, "Mission-260", "Europa", "Boeing", 3600.0, LocalDateTime.of(2029, 8, 8, 10, 30), LocalDateTime.of(2031, 8, 8, 9, 15), "Solar Sail", 3300.0, "X-Band", 27000000.0, 36.0, "Thermal Sensor", "Camera", 560, true, "Planned", 74.0, "Trajectory-260");
                SpaceProbeDTO probe261 = new SpaceProbeDTO(261, "Mission-261", "Mars", "NASA", 3610.0, LocalDateTime.of(2020, 9, 9, 10, 30), LocalDateTime.of(2022, 9, 9, 9, 15), "Chemical", 3305.0, "X-Band", 27100000.0, 36.1, "Camera", "Spectrometer", 561, false, "Active", 73.9, "Trajectory-261");
                SpaceProbeDTO probe262 = new SpaceProbeDTO(262, "Mission-262", "Venus", "ISRO", 3620.0, LocalDateTime.of(2021, 10, 10, 10, 30), LocalDateTime.of(2023, 10, 10, 9, 15), "Ion", 3310.0, "X-Band", 27200000.0, 36.2, "Spectrometer", "Radar", 562, true, "Completed", 73.8, "Trajectory-262");
                SpaceProbeDTO probe263 = new SpaceProbeDTO(263, "Mission-263", "Jupiter", "ESA", 3630.0, LocalDateTime.of(2022, 11, 11, 10, 30), LocalDateTime.of(2024, 11, 11, 9, 15), "Nuclear", 3315.0, "X-Band", 27300000.0, 36.3, "Radar", "Magnetometer", 563, false, "Standby", 73.7, "Trajectory-263");
                SpaceProbeDTO probe264 = new SpaceProbeDTO(264, "Mission-264", "Saturn", "JAXA", 3640.0, LocalDateTime.of(2023, 12, 12, 10, 30), LocalDateTime.of(2025, 12, 12, 9, 15), "Electric", 3320.0, "X-Band", 27400000.0, 36.4, "Magnetometer", "Thermal Sensor", 564, true, "Planned", 73.6, "Trajectory-264");
                SpaceProbeDTO probe265 = new SpaceProbeDTO(265, "Mission-265", "Mercury", "CNSA", 3650.0, LocalDateTime.of(2024, 1, 13, 10, 30), LocalDateTime.of(2026, 1, 13, 9, 15), "Solar Sail", 3325.0, "X-Band", 27500000.0, 36.5, "Thermal Sensor", "Camera", 565, false, "Active", 73.5, "Trajectory-265");
                SpaceProbeDTO probe266 = new SpaceProbeDTO(266, "Mission-266", "Neptune", "SpaceX", 3660.0, LocalDateTime.of(2025, 2, 14, 10, 30), LocalDateTime.of(2027, 2, 14, 9, 15), "Chemical", 3330.0, "X-Band", 27600000.0, 36.6, "Camera", "Spectrometer", 566, true, "Completed", 73.4, "Trajectory-266");
                SpaceProbeDTO probe267 = new SpaceProbeDTO(267, "Mission-267", "Uranus", "Roscosmos", 3670.0, LocalDateTime.of(2026, 3, 15, 10, 30), LocalDateTime.of(2028, 3, 15, 9, 15), "Ion", 3335.0, "X-Band", 27700000.0, 36.7, "Spectrometer", "Radar", 567, false, "Standby", 73.3, "Trajectory-267");
                SpaceProbeDTO probe268 = new SpaceProbeDTO(268, "Mission-268", "Pluto", "BlueOrigin", 3680.0, LocalDateTime.of(2027, 4, 16, 10, 30), LocalDateTime.of(2029, 4, 16, 9, 15), "Nuclear", 3340.0, "X-Band", 27800000.0, 36.8, "Radar", "Magnetometer", 568, true, "Planned", 73.2, "Trajectory-268");
                SpaceProbeDTO probe269 = new SpaceProbeDTO(269, "Mission-269", "Moon", "ULA", 3690.0, LocalDateTime.of(2028, 5, 17, 10, 30), LocalDateTime.of(2030, 5, 17, 9, 15), "Electric", 3345.0, "X-Band", 27900000.0, 36.9, "Magnetometer", "Thermal Sensor", 569, false, "Active", 73.1, "Trajectory-269");
                SpaceProbeDTO probe270 = new SpaceProbeDTO(270, "Mission-270", "Europa", "Boeing", 3700.0, LocalDateTime.of(2029, 6, 18, 10, 30), LocalDateTime.of(2031, 6, 18, 9, 15), "Solar Sail", 3350.0, "X-Band", 28000000.0, 37.0, "Thermal Sensor", "Camera", 570, true, "Completed", 73.0, "Trajectory-270");
                SpaceProbeDTO probe271 = new SpaceProbeDTO(271, "Mission-271", "Mars", "NASA", 3710.0, LocalDateTime.of(2020, 7, 19, 10, 30), LocalDateTime.of(2022, 7, 19, 9, 15), "Chemical", 3355.0, "X-Band", 28100000.0, 37.1, "Camera", "Spectrometer", 571, false, "Standby", 72.9, "Trajectory-271");
                SpaceProbeDTO probe272 = new SpaceProbeDTO(272, "Mission-272", "Venus", "ISRO", 3720.0, LocalDateTime.of(2021, 8, 20, 10, 30), LocalDateTime.of(2023, 8, 20, 9, 15), "Ion", 3360.0, "X-Band", 28200000.0, 37.2, "Spectrometer", "Radar", 572, true, "Planned", 72.8, "Trajectory-272");
                SpaceProbeDTO probe273 = new SpaceProbeDTO(273, "Mission-273", "Jupiter", "ESA", 3730.0, LocalDateTime.of(2022, 9, 21, 10, 30), LocalDateTime.of(2024, 9, 21, 9, 15), "Nuclear", 3365.0, "X-Band", 28300000.0, 37.3, "Radar", "Magnetometer", 573, false, "Active", 72.7, "Trajectory-273");
                SpaceProbeDTO probe274 = new SpaceProbeDTO(274, "Mission-274", "Saturn", "JAXA", 3740.0, LocalDateTime.of(2023, 10, 22, 10, 30), LocalDateTime.of(2025, 10, 22, 9, 15), "Electric", 3370.0, "X-Band", 28400000.0, 37.4, "Magnetometer", "Thermal Sensor", 574, true, "Completed", 72.6, "Trajectory-274");
                SpaceProbeDTO probe275 = new SpaceProbeDTO(275, "Mission-275", "Mercury", "CNSA", 3750.0, LocalDateTime.of(2024, 11, 23, 10, 30), LocalDateTime.of(2026, 11, 23, 9, 15), "Solar Sail", 3375.0, "X-Band", 28500000.0, 37.5, "Thermal Sensor", "Camera", 575, false, "Standby", 72.5, "Trajectory-275");
                SpaceProbeDTO probe276 = new SpaceProbeDTO(276, "Mission-276", "Neptune", "SpaceX", 3760.0, LocalDateTime.of(2025, 12, 24, 10, 30), LocalDateTime.of(2027, 12, 24, 9, 15), "Chemical", 3380.0, "X-Band", 28600000.0, 37.6, "Camera", "Spectrometer", 576, true, "Planned", 72.4, "Trajectory-276");
                SpaceProbeDTO probe277 = new SpaceProbeDTO(277, "Mission-277", "Uranus", "Roscosmos", 3770.0, LocalDateTime.of(2026, 1, 25, 10, 30), LocalDateTime.of(2028, 1, 25, 9, 15), "Ion", 3385.0, "X-Band", 28700000.0, 37.7, "Spectrometer", "Radar", 577, false, "Active", 72.3, "Trajectory-277");
                SpaceProbeDTO probe278 = new SpaceProbeDTO(278, "Mission-278", "Pluto", "BlueOrigin", 3780.0, LocalDateTime.of(2027, 2, 26, 10, 30), LocalDateTime.of(2029, 2, 26, 9, 15), "Nuclear", 3390.0, "X-Band", 28800000.0, 37.8, "Radar", "Magnetometer", 578, true, "Completed", 72.2, "Trajectory-278");
                SpaceProbeDTO probe279 = new SpaceProbeDTO(279, "Mission-279", "Moon", "ULA", 3790.0, LocalDateTime.of(2028, 3, 27, 10, 30), LocalDateTime.of(2030, 3, 27, 9, 15), "Electric", 3395.0, "X-Band", 28900000.0, 37.9, "Magnetometer", "Thermal Sensor", 579, false, "Standby", 72.1, "Trajectory-279");
                SpaceProbeDTO probe280 = new SpaceProbeDTO(280, "Mission-280", "Europa", "Boeing", 3800.0, LocalDateTime.of(2029, 4, 28, 10, 30), LocalDateTime.of(2031, 4, 28, 9, 15), "Solar Sail", 3400.0, "X-Band", 29000000.0, 38.0, "Thermal Sensor", "Camera", 580, true, "Planned", 72.0, "Trajectory-280");
                SpaceProbeDTO probe281 = new SpaceProbeDTO(281, "Mission-281", "Mars", "NASA", 3810.0, LocalDateTime.of(2020, 5, 1, 10, 30), LocalDateTime.of(2022, 5, 1, 9, 15), "Chemical", 3405.0, "X-Band", 29100000.0, 38.1, "Camera", "Spectrometer", 581, false, "Active", 71.9, "Trajectory-281");
                SpaceProbeDTO probe282 = new SpaceProbeDTO(282, "Mission-282", "Venus", "ISRO", 3820.0, LocalDateTime.of(2021, 6, 2, 10, 30), LocalDateTime.of(2023, 6, 2, 9, 15), "Ion", 3410.0, "X-Band", 29200000.0, 38.2, "Spectrometer", "Radar", 582, true, "Completed", 71.8, "Trajectory-282");
                SpaceProbeDTO probe283 = new SpaceProbeDTO(283, "Mission-283", "Jupiter", "ESA", 3830.0, LocalDateTime.of(2022, 7, 3, 10, 30), LocalDateTime.of(2024, 7, 3, 9, 15), "Nuclear", 3415.0, "X-Band", 29300000.0, 38.3, "Radar", "Magnetometer", 583, false, "Standby", 71.7, "Trajectory-283");
                SpaceProbeDTO probe284 = new SpaceProbeDTO(284, "Mission-284", "Saturn", "JAXA", 3840.0, LocalDateTime.of(2023, 8, 4, 10, 30), LocalDateTime.of(2025, 8, 4, 9, 15), "Electric", 3420.0, "X-Band", 29400000.0, 38.4, "Magnetometer", "Thermal Sensor", 584, true, "Planned", 71.6, "Trajectory-284");
                SpaceProbeDTO probe285 = new SpaceProbeDTO(285, "Mission-285", "Mercury", "CNSA", 3850.0, LocalDateTime.of(2024, 9, 5, 10, 30), LocalDateTime.of(2026, 9, 5, 9, 15), "Solar Sail", 3425.0, "X-Band", 29500000.0, 38.5, "Thermal Sensor", "Camera", 585, false, "Active", 71.5, "Trajectory-285");
                SpaceProbeDTO probe286 = new SpaceProbeDTO(286, "Mission-286", "Neptune", "SpaceX", 3860.0, LocalDateTime.of(2025, 10, 6, 10, 30), LocalDateTime.of(2027, 10, 6, 9, 15), "Chemical", 3430.0, "X-Band", 29600000.0, 38.6, "Camera", "Spectrometer", 586, true, "Completed", 71.4, "Trajectory-286");
                SpaceProbeDTO probe287 = new SpaceProbeDTO(287, "Mission-287", "Uranus", "Roscosmos", 3870.0, LocalDateTime.of(2026, 11, 7, 10, 30), LocalDateTime.of(2028, 11, 7, 9, 15), "Ion", 3435.0, "X-Band", 29700000.0, 38.7, "Spectrometer", "Radar", 587, false, "Standby", 71.3, "Trajectory-287");
                SpaceProbeDTO probe288 = new SpaceProbeDTO(288, "Mission-288", "Pluto", "BlueOrigin", 3880.0, LocalDateTime.of(2027, 12, 8, 10, 30), LocalDateTime.of(2029, 12, 8, 9, 15), "Nuclear", 3440.0, "X-Band", 29800000.0, 38.8, "Radar", "Magnetometer", 588, true, "Planned", 71.2, "Trajectory-288");
                SpaceProbeDTO probe289 = new SpaceProbeDTO(289, "Mission-289", "Moon", "ULA", 3890.0, LocalDateTime.of(2028, 1, 9, 10, 30), LocalDateTime.of(2030, 1, 9, 9, 15), "Electric", 3445.0, "X-Band", 29900000.0, 38.9, "Magnetometer", "Thermal Sensor", 589, false, "Active", 71.1, "Trajectory-289");
                SpaceProbeDTO probe290 = new SpaceProbeDTO(290, "Mission-290", "Europa", "Boeing", 3900.0, LocalDateTime.of(2029, 2, 10, 10, 30), LocalDateTime.of(2031, 2, 10, 9, 15), "Solar Sail", 3450.0, "X-Band", 30000000.0, 39.0, "Thermal Sensor", "Camera", 590, true, "Completed", 71.0, "Trajectory-290");
                SpaceProbeDTO probe291 = new SpaceProbeDTO(291, "Mission-291", "Mars", "NASA", 3910.0, LocalDateTime.of(2020, 3, 11, 10, 30), LocalDateTime.of(2022, 3, 11, 9, 15), "Chemical", 3455.0, "X-Band", 30100000.0, 39.1, "Camera", "Spectrometer", 591, false, "Standby", 70.9, "Trajectory-291");
                SpaceProbeDTO probe292 = new SpaceProbeDTO(292, "Mission-292", "Venus", "ISRO", 3920.0, LocalDateTime.of(2021, 4, 12, 10, 30), LocalDateTime.of(2023, 4, 12, 9, 15), "Ion", 3460.0, "X-Band", 30200000.0, 39.2, "Spectrometer", "Radar", 592, true, "Planned", 70.8, "Trajectory-292");
                SpaceProbeDTO probe293 = new SpaceProbeDTO(293, "Mission-293", "Jupiter", "ESA", 3930.0, LocalDateTime.of(2022, 5, 13, 10, 30), LocalDateTime.of(2024, 5, 13, 9, 15), "Nuclear", 3465.0, "X-Band", 30300000.0, 39.3, "Radar", "Magnetometer", 593, false, "Active", 70.7, "Trajectory-293");
                SpaceProbeDTO probe294 = new SpaceProbeDTO(294, "Mission-294", "Saturn", "JAXA", 3940.0, LocalDateTime.of(2023, 6, 14, 10, 30), LocalDateTime.of(2025, 6, 14, 9, 15), "Electric", 3470.0, "X-Band", 30400000.0, 39.4, "Magnetometer", "Thermal Sensor", 594, true, "Completed", 70.6, "Trajectory-294");
                SpaceProbeDTO probe295 = new SpaceProbeDTO(295, "Mission-295", "Mercury", "CNSA", 3950.0, LocalDateTime.of(2024, 7, 15, 10, 30), LocalDateTime.of(2026, 7, 15, 9, 15), "Solar Sail", 3475.0, "X-Band", 30500000.0, 39.5, "Thermal Sensor", "Camera", 595, false, "Standby", 70.5, "Trajectory-295");
                SpaceProbeDTO probe296 = new SpaceProbeDTO(296, "Mission-296", "Neptune", "SpaceX", 3960.0, LocalDateTime.of(2025, 8, 16, 10, 30), LocalDateTime.of(2027, 8, 16, 9, 15), "Chemical", 3480.0, "X-Band", 30600000.0, 39.6, "Camera", "Spectrometer", 596, true, "Planned", 70.4, "Trajectory-296");
                SpaceProbeDTO probe297 = new SpaceProbeDTO(297, "Mission-297", "Uranus", "Roscosmos", 3970.0, LocalDateTime.of(2026, 9, 17, 10, 30), LocalDateTime.of(2028, 9, 17, 9, 15), "Ion", 3485.0, "X-Band", 30700000.0, 39.7, "Spectrometer", "Radar", 597, false, "Active", 70.3, "Trajectory-297");
                SpaceProbeDTO probe298 = new SpaceProbeDTO(298, "Mission-298", "Pluto", "BlueOrigin", 3980.0, LocalDateTime.of(2027, 10, 18, 10, 30), LocalDateTime.of(2029, 10, 18, 9, 15), "Nuclear", 3490.0, "X-Band", 30800000.0, 39.8, "Radar", "Magnetometer", 598, true, "Completed", 70.2, "Trajectory-298");
                SpaceProbeDTO probe299 = new SpaceProbeDTO(299, "Mission-299", "Moon", "ULA", 3990.0, LocalDateTime.of(2028, 11, 19, 10, 30), LocalDateTime.of(2030, 11, 19, 9, 15), "Electric", 3495.0, "X-Band", 30900000.0, 39.9, "Magnetometer", "Thermal Sensor", 599, false, "Standby", 70.1, "Trajectory-299");
                SpaceProbeDTO probe300 = new SpaceProbeDTO(300, "Mission-300", "Europa", "Boeing", 4000.0, LocalDateTime.of(2029, 12, 20, 10, 30), LocalDateTime.of(2031, 12, 20, 9, 15), "Solar Sail", 3500.0, "X-Band", 31000000.0, 40.0, "Thermal Sensor", "Camera", 600, true, "Planned", 70.0, "Trajectory-300");
                SpaceProbeDTO probe301 = new SpaceProbeDTO(301, "Mission-301", "Mars", "NASA", 4010.0, LocalDateTime.of(2020, 1, 21, 10, 30), LocalDateTime.of(2022, 1, 21, 9, 15), "Chemical", 3505.0, "X-Band", 31100000.0, 40.1, "Camera", "Spectrometer", 601, false, "Active", 69.9, "Trajectory-301");
                SpaceProbeDTO probe302 = new SpaceProbeDTO(302, "Mission-302", "Venus", "ISRO", 4020.0, LocalDateTime.of(2021, 2, 22, 10, 30), LocalDateTime.of(2023, 2, 22, 9, 15), "Ion", 3510.0, "X-Band", 31200000.0, 40.2, "Spectrometer", "Radar", 602, true, "Completed", 69.8, "Trajectory-302");
                SpaceProbeDTO probe303 = new SpaceProbeDTO(303, "Mission-303", "Jupiter", "ESA", 4030.0, LocalDateTime.of(2022, 3, 23, 10, 30), LocalDateTime.of(2024, 3, 23, 9, 15), "Nuclear", 3515.0, "X-Band", 31300000.0, 40.3, "Radar", "Magnetometer", 603, false, "Standby", 69.7, "Trajectory-303");
                SpaceProbeDTO probe304 = new SpaceProbeDTO(304, "Mission-304", "Saturn", "JAXA", 4040.0, LocalDateTime.of(2023, 4, 24, 10, 30), LocalDateTime.of(2025, 4, 24, 9, 15), "Electric", 3520.0, "X-Band", 31400000.0, 40.4, "Magnetometer", "Thermal Sensor", 604, true, "Planned", 69.6, "Trajectory-304");
                SpaceProbeDTO probe305 = new SpaceProbeDTO(305, "Mission-305", "Mercury", "CNSA", 4050.0, LocalDateTime.of(2024, 5, 25, 10, 30), LocalDateTime.of(2026, 5, 25, 9, 15), "Solar Sail", 3525.0, "X-Band", 31500000.0, 40.5, "Thermal Sensor", "Camera", 605, false, "Active", 69.5, "Trajectory-305");
                SpaceProbeDTO probe306 = new SpaceProbeDTO(306, "Mission-306", "Neptune", "SpaceX", 4060.0, LocalDateTime.of(2025, 6, 26, 10, 30), LocalDateTime.of(2027, 6, 26, 9, 15), "Chemical", 3530.0, "X-Band", 31600000.0, 40.6, "Camera", "Spectrometer", 606, true, "Completed", 69.4, "Trajectory-306");
                SpaceProbeDTO probe307 = new SpaceProbeDTO(307, "Mission-307", "Uranus", "Roscosmos", 4070.0, LocalDateTime.of(2026, 7, 27, 10, 30), LocalDateTime.of(2028, 7, 27, 9, 15), "Ion", 3535.0, "X-Band", 31700000.0, 40.7, "Spectrometer", "Radar", 607, false, "Standby", 69.3, "Trajectory-307");
                SpaceProbeDTO probe308 = new SpaceProbeDTO(308, "Mission-308", "Pluto", "BlueOrigin", 4080.0, LocalDateTime.of(2027, 8, 28, 10, 30), LocalDateTime.of(2029, 8, 28, 9, 15), "Nuclear", 3540.0, "X-Band", 31800000.0, 40.8, "Radar", "Magnetometer", 608, true, "Planned", 69.2, "Trajectory-308");
                SpaceProbeDTO probe309 = new SpaceProbeDTO(309, "Mission-309", "Moon", "ULA", 4090.0, LocalDateTime.of(2028, 9, 1, 10, 30), LocalDateTime.of(2030, 9, 1, 9, 15), "Electric", 3545.0, "X-Band", 31900000.0, 40.9, "Magnetometer", "Thermal Sensor", 609, false, "Active", 69.1, "Trajectory-309");
                SpaceProbeDTO probe310 = new SpaceProbeDTO(310, "Mission-310", "Europa", "Boeing", 4100.0, LocalDateTime.of(2029, 10, 2, 10, 30), LocalDateTime.of(2031, 10, 2, 9, 15), "Solar Sail", 3550.0, "X-Band", 32000000.0, 41.0, "Thermal Sensor", "Camera", 610, true, "Completed", 69.0, "Trajectory-310");
                SpaceProbeDTO probe311 = new SpaceProbeDTO(311, "Mission-311", "Mars", "NASA", 4110.0, LocalDateTime.of(2020, 11, 3, 10, 30), LocalDateTime.of(2022, 11, 3, 9, 15), "Chemical", 3555.0, "X-Band", 32100000.0, 41.1, "Camera", "Spectrometer", 611, false, "Standby", 68.9, "Trajectory-311");
                SpaceProbeDTO probe312 = new SpaceProbeDTO(312, "Mission-312", "Venus", "ISRO", 4120.0, LocalDateTime.of(2021, 12, 4, 10, 30), LocalDateTime.of(2023, 12, 4, 9, 15), "Ion", 3560.0, "X-Band", 32200000.0, 41.2, "Spectrometer", "Radar", 612, true, "Planned", 68.8, "Trajectory-312");
                SpaceProbeDTO probe313 = new SpaceProbeDTO(313, "Mission-313", "Jupiter", "ESA", 4130.0, LocalDateTime.of(2022, 1, 5, 10, 30), LocalDateTime.of(2024, 1, 5, 9, 15), "Nuclear", 3565.0, "X-Band", 32300000.0, 41.3, "Radar", "Magnetometer", 613, false, "Active", 68.7, "Trajectory-313");
                SpaceProbeDTO probe314 = new SpaceProbeDTO(314, "Mission-314", "Saturn", "JAXA", 4140.0, LocalDateTime.of(2023, 2, 6, 10, 30), LocalDateTime.of(2025, 2, 6, 9, 15), "Electric", 3570.0, "X-Band", 32400000.0, 41.4, "Magnetometer", "Thermal Sensor", 614, true, "Completed", 68.6, "Trajectory-314");
                SpaceProbeDTO probe315 = new SpaceProbeDTO(315, "Mission-315", "Mercury", "CNSA", 4150.0, LocalDateTime.of(2024, 3, 7, 10, 30), LocalDateTime.of(2026, 3, 7, 9, 15), "Solar Sail", 3575.0, "X-Band", 32500000.0, 41.5, "Thermal Sensor", "Camera", 615, false, "Standby", 68.5, "Trajectory-315");
                SpaceProbeDTO probe316 = new SpaceProbeDTO(316, "Mission-316", "Neptune", "SpaceX", 4160.0, LocalDateTime.of(2025, 4, 8, 10, 30), LocalDateTime.of(2027, 4, 8, 9, 15), "Chemical", 3580.0, "X-Band", 32600000.0, 41.6, "Camera", "Spectrometer", 616, true, "Planned", 68.4, "Trajectory-316");
                SpaceProbeDTO probe317 = new SpaceProbeDTO(317, "Mission-317", "Uranus", "Roscosmos", 4170.0, LocalDateTime.of(2026, 5, 9, 10, 30), LocalDateTime.of(2028, 5, 9, 9, 15), "Ion", 3585.0, "X-Band", 32700000.0, 41.7, "Spectrometer", "Radar", 617, false, "Active", 68.3, "Trajectory-317");
                SpaceProbeDTO probe318 = new SpaceProbeDTO(318, "Mission-318", "Pluto", "BlueOrigin", 4180.0, LocalDateTime.of(2027, 6, 10, 10, 30), LocalDateTime.of(2029, 6, 10, 9, 15), "Nuclear", 3590.0, "X-Band", 32800000.0, 41.8, "Radar", "Magnetometer", 618, true, "Completed", 68.2, "Trajectory-318");
                SpaceProbeDTO probe319 = new SpaceProbeDTO(319, "Mission-319", "Moon", "ULA", 4190.0, LocalDateTime.of(2028, 7, 11, 10, 30), LocalDateTime.of(2030, 7, 11, 9, 15), "Electric", 3595.0, "X-Band", 32900000.0, 41.9, "Magnetometer", "Thermal Sensor", 619, false, "Standby", 68.1, "Trajectory-319");
                SpaceProbeDTO probe320 = new SpaceProbeDTO(320, "Mission-320", "Europa", "Boeing", 4200.0, LocalDateTime.of(2029, 8, 12, 10, 30), LocalDateTime.of(2031, 8, 12, 9, 15), "Solar Sail", 3600.0, "X-Band", 33000000.0, 42.0, "Thermal Sensor", "Camera", 620, true, "Planned", 68.0, "Trajectory-320");
                SpaceProbeDTO probe321 = new SpaceProbeDTO(321, "Mission-321", "Mars", "NASA", 4210.0, LocalDateTime.of(2020, 9, 13, 10, 30), LocalDateTime.of(2022, 9, 13, 9, 15), "Chemical", 3605.0, "X-Band", 33100000.0, 42.1, "Camera", "Spectrometer", 621, false, "Active", 67.9, "Trajectory-321");
                SpaceProbeDTO probe322 = new SpaceProbeDTO(322, "Mission-322", "Venus", "ISRO", 4220.0, LocalDateTime.of(2021, 10, 14, 10, 30), LocalDateTime.of(2023, 10, 14, 9, 15), "Ion", 3610.0, "X-Band", 33200000.0, 42.2, "Spectrometer", "Radar", 622, true, "Completed", 67.8, "Trajectory-322");
                SpaceProbeDTO probe323 = new SpaceProbeDTO(323, "Mission-323", "Jupiter", "ESA", 4230.0, LocalDateTime.of(2022, 11, 15, 10, 30), LocalDateTime.of(2024, 11, 15, 9, 15), "Nuclear", 3615.0, "X-Band", 33300000.0, 42.3, "Radar", "Magnetometer", 623, false, "Standby", 67.7, "Trajectory-323");
                SpaceProbeDTO probe324 = new SpaceProbeDTO(324, "Mission-324", "Saturn", "JAXA", 4240.0, LocalDateTime.of(2023, 12, 16, 10, 30), LocalDateTime.of(2025, 12, 16, 9, 15), "Electric", 3620.0, "X-Band", 33400000.0, 42.4, "Magnetometer", "Thermal Sensor", 624, true, "Planned", 67.6, "Trajectory-324");
                SpaceProbeDTO probe325 = new SpaceProbeDTO(325, "Mission-325", "Mercury", "CNSA", 4250.0, LocalDateTime.of(2024, 1, 17, 10, 30), LocalDateTime.of(2026, 1, 17, 9, 15), "Solar Sail", 3625.0, "X-Band", 33500000.0, 42.5, "Thermal Sensor", "Camera", 625, false, "Active", 67.5, "Trajectory-325");
                SpaceProbeDTO probe326 = new SpaceProbeDTO(326, "Mission-326", "Neptune", "SpaceX", 4260.0, LocalDateTime.of(2025, 2, 18, 10, 30), LocalDateTime.of(2027, 2, 18, 9, 15), "Chemical", 3630.0, "X-Band", 33600000.0, 42.6, "Camera", "Spectrometer", 626, true, "Completed", 67.4, "Trajectory-326");
                SpaceProbeDTO probe327 = new SpaceProbeDTO(327, "Mission-327", "Uranus", "Roscosmos", 4270.0, LocalDateTime.of(2026, 3, 19, 10, 30), LocalDateTime.of(2028, 3, 19, 9, 15), "Ion", 3635.0, "X-Band", 33700000.0, 42.7, "Spectrometer", "Radar", 627, false, "Standby", 67.3, "Trajectory-327");
                SpaceProbeDTO probe328 = new SpaceProbeDTO(328, "Mission-328", "Pluto", "BlueOrigin", 4280.0, LocalDateTime.of(2027, 4, 20, 10, 30), LocalDateTime.of(2029, 4, 20, 9, 15), "Nuclear", 3640.0, "X-Band", 33800000.0, 42.8, "Radar", "Magnetometer", 628, true, "Planned", 67.2, "Trajectory-328");
                SpaceProbeDTO probe329 = new SpaceProbeDTO(329, "Mission-329", "Moon", "ULA", 4290.0, LocalDateTime.of(2028, 5, 21, 10, 30), LocalDateTime.of(2030, 5, 21, 9, 15), "Electric", 3645.0, "X-Band", 33900000.0, 42.9, "Magnetometer", "Thermal Sensor", 629, false, "Active", 67.1, "Trajectory-329");
                SpaceProbeDTO probe330 = new SpaceProbeDTO(330, "Mission-330", "Europa", "Boeing", 4300.0, LocalDateTime.of(2029, 6, 22, 10, 30), LocalDateTime.of(2031, 6, 22, 9, 15), "Solar Sail", 3650.0, "X-Band", 34000000.0, 43.0, "Thermal Sensor", "Camera", 630, true, "Completed", 67.0, "Trajectory-330");
                SpaceProbeDTO probe331 = new SpaceProbeDTO(331, "Mission-331", "Mars", "NASA", 4310.0, LocalDateTime.of(2020, 7, 23, 10, 30), LocalDateTime.of(2022, 7, 23, 9, 15), "Chemical", 3655.0, "X-Band", 34100000.0, 43.1, "Camera", "Spectrometer", 631, false, "Standby", 66.9, "Trajectory-331");
                SpaceProbeDTO probe332 = new SpaceProbeDTO(332, "Mission-332", "Venus", "ISRO", 4320.0, LocalDateTime.of(2021, 8, 24, 10, 30), LocalDateTime.of(2023, 8, 24, 9, 15), "Ion", 3660.0, "X-Band", 34200000.0, 43.2, "Spectrometer", "Radar", 632, true, "Planned", 66.8, "Trajectory-332");
                SpaceProbeDTO probe333 = new SpaceProbeDTO(333, "Mission-333", "Jupiter", "ESA", 4330.0, LocalDateTime.of(2022, 9, 25, 10, 30), LocalDateTime.of(2024, 9, 25, 9, 15), "Nuclear", 3665.0, "X-Band", 34300000.0, 43.3, "Radar", "Magnetometer", 633, false, "Active", 66.7, "Trajectory-333");
                SpaceProbeDTO probe334 = new SpaceProbeDTO(334, "Mission-334", "Saturn", "JAXA", 4340.0, LocalDateTime.of(2023, 10, 26, 10, 30), LocalDateTime.of(2025, 10, 26, 9, 15), "Electric", 3670.0, "X-Band", 34400000.0, 43.4, "Magnetometer", "Thermal Sensor", 634, true, "Completed", 66.6, "Trajectory-334");
                SpaceProbeDTO probe335 = new SpaceProbeDTO(335, "Mission-335", "Mercury", "CNSA", 4350.0, LocalDateTime.of(2024, 11, 27, 10, 30), LocalDateTime.of(2026, 11, 27, 9, 15), "Solar Sail", 3675.0, "X-Band", 34500000.0, 43.5, "Thermal Sensor", "Camera", 635, false, "Standby", 66.5, "Trajectory-335");
                SpaceProbeDTO probe336 = new SpaceProbeDTO(336, "Mission-336", "Neptune", "SpaceX", 4360.0, LocalDateTime.of(2025, 12, 28, 10, 30), LocalDateTime.of(2027, 12, 28, 9, 15), "Chemical", 3680.0, "X-Band", 34600000.0, 43.6, "Camera", "Spectrometer", 636, true, "Planned", 66.4, "Trajectory-336");
                SpaceProbeDTO probe337 = new SpaceProbeDTO(337, "Mission-337", "Uranus", "Roscosmos", 4370.0, LocalDateTime.of(2026, 1, 1, 10, 30), LocalDateTime.of(2028, 1, 1, 9, 15), "Ion", 3685.0, "X-Band", 34700000.0, 43.7, "Spectrometer", "Radar", 637, false, "Active", 66.3, "Trajectory-337");
                SpaceProbeDTO probe338 = new SpaceProbeDTO(338, "Mission-338", "Pluto", "BlueOrigin", 4380.0, LocalDateTime.of(2027, 2, 2, 10, 30), LocalDateTime.of(2029, 2, 2, 9, 15), "Nuclear", 3690.0, "X-Band", 34800000.0, 43.8, "Radar", "Magnetometer", 638, true, "Completed", 66.2, "Trajectory-338");
                SpaceProbeDTO probe339 = new SpaceProbeDTO(339, "Mission-339", "Moon", "ULA", 4390.0, LocalDateTime.of(2028, 3, 3, 10, 30), LocalDateTime.of(2030, 3, 3, 9, 15), "Electric", 3695.0, "X-Band", 34900000.0, 43.9, "Magnetometer", "Thermal Sensor", 639, false, "Standby", 66.1, "Trajectory-339");
                SpaceProbeDTO probe340 = new SpaceProbeDTO(340, "Mission-340", "Europa", "Boeing", 4400.0, LocalDateTime.of(2029, 4, 4, 10, 30), LocalDateTime.of(2031, 4, 4, 9, 15), "Solar Sail", 3700.0, "X-Band", 35000000.0, 44.0, "Thermal Sensor", "Camera", 640, true, "Planned", 66.0, "Trajectory-340");
                SpaceProbeDTO probe341 = new SpaceProbeDTO(341, "Mission-341", "Mars", "NASA", 4410.0, LocalDateTime.of(2020, 5, 5, 10, 30), LocalDateTime.of(2022, 5, 5, 9, 15), "Chemical", 3705.0, "X-Band", 35100000.0, 44.1, "Camera", "Spectrometer", 641, false, "Active", 65.9, "Trajectory-341");
                SpaceProbeDTO probe342 = new SpaceProbeDTO(342, "Mission-342", "Venus", "ISRO", 4420.0, LocalDateTime.of(2021, 6, 6, 10, 30), LocalDateTime.of(2023, 6, 6, 9, 15), "Ion", 3710.0, "X-Band", 35200000.0, 44.2, "Spectrometer", "Radar", 642, true, "Completed", 65.8, "Trajectory-342");
                SpaceProbeDTO probe343 = new SpaceProbeDTO(343, "Mission-343", "Jupiter", "ESA", 4430.0, LocalDateTime.of(2022, 7, 7, 10, 30), LocalDateTime.of(2024, 7, 7, 9, 15), "Nuclear", 3715.0, "X-Band", 35300000.0, 44.3, "Radar", "Magnetometer", 643, false, "Standby", 65.7, "Trajectory-343");
                SpaceProbeDTO probe344 = new SpaceProbeDTO(344, "Mission-344", "Saturn", "JAXA", 4440.0, LocalDateTime.of(2023, 8, 8, 10, 30), LocalDateTime.of(2025, 8, 8, 9, 15), "Electric", 3720.0, "X-Band", 35400000.0, 44.4, "Magnetometer", "Thermal Sensor", 644, true, "Planned", 65.6, "Trajectory-344");
                SpaceProbeDTO probe345 = new SpaceProbeDTO(345, "Mission-345", "Mercury", "CNSA", 4450.0, LocalDateTime.of(2024, 9, 9, 10, 30), LocalDateTime.of(2026, 9, 9, 9, 15), "Solar Sail", 3725.0, "X-Band", 35500000.0, 44.5, "Thermal Sensor", "Camera", 645, false, "Active", 65.5, "Trajectory-345");
                SpaceProbeDTO probe346 = new SpaceProbeDTO(346, "Mission-346", "Neptune", "SpaceX", 4460.0, LocalDateTime.of(2025, 10, 10, 10, 30), LocalDateTime.of(2027, 10, 10, 9, 15), "Chemical", 3730.0, "X-Band", 35600000.0, 44.6, "Camera", "Spectrometer", 646, true, "Completed", 65.4, "Trajectory-346");
                SpaceProbeDTO probe347 = new SpaceProbeDTO(347, "Mission-347", "Uranus", "Roscosmos", 4470.0, LocalDateTime.of(2026, 11, 11, 10, 30), LocalDateTime.of(2028, 11, 11, 9, 15), "Ion", 3735.0, "X-Band", 35700000.0, 44.7, "Spectrometer", "Radar", 647, false, "Standby", 65.3, "Trajectory-347");
                SpaceProbeDTO probe348 = new SpaceProbeDTO(348, "Mission-348", "Pluto", "BlueOrigin", 4480.0, LocalDateTime.of(2027, 12, 12, 10, 30), LocalDateTime.of(2029, 12, 12, 9, 15), "Nuclear", 3740.0, "X-Band", 35800000.0, 44.8, "Radar", "Magnetometer", 648, true, "Planned", 65.2, "Trajectory-348");
                SpaceProbeDTO probe349 = new SpaceProbeDTO(349, "Mission-349", "Moon", "ULA", 4490.0, LocalDateTime.of(2028, 1, 13, 10, 30), LocalDateTime.of(2030, 1, 13, 9, 15), "Electric", 3745.0, "X-Band", 35900000.0, 44.9, "Magnetometer", "Thermal Sensor", 649, false, "Active", 65.1, "Trajectory-349");
                SpaceProbeDTO probe350 = new SpaceProbeDTO(350, "Mission-350", "Europa", "Boeing", 4500.0, LocalDateTime.of(2029, 2, 14, 10, 30), LocalDateTime.of(2031, 2, 14, 9, 15), "Solar Sail", 3750.0, "X-Band", 36000000.0, 45.0, "Thermal Sensor", "Camera", 650, true, "Completed", 65.0, "Trajectory-350");
                SpaceProbeDTO probe351 = new SpaceProbeDTO(351, "Mission-351", "Mars", "NASA", 4510.0, LocalDateTime.of(2020, 3, 15, 10, 30), LocalDateTime.of(2022, 3, 15, 9, 15), "Chemical", 3755.0, "X-Band", 36100000.0, 45.1, "Camera", "Spectrometer", 651, false, "Standby", 64.9, "Trajectory-351");
                SpaceProbeDTO probe352 = new SpaceProbeDTO(352, "Mission-352", "Venus", "ISRO", 4520.0, LocalDateTime.of(2021, 4, 16, 10, 30), LocalDateTime.of(2023, 4, 16, 9, 15), "Ion", 3760.0, "X-Band", 36200000.0, 45.2, "Spectrometer", "Radar", 652, true, "Planned", 64.8, "Trajectory-352");
                SpaceProbeDTO probe353 = new SpaceProbeDTO(353, "Mission-353", "Jupiter", "ESA", 4530.0, LocalDateTime.of(2022, 5, 17, 10, 30), LocalDateTime.of(2024, 5, 17, 9, 15), "Nuclear", 3765.0, "X-Band", 36300000.0, 45.3, "Radar", "Magnetometer", 653, false, "Active", 64.7, "Trajectory-353");
                SpaceProbeDTO probe354 = new SpaceProbeDTO(354, "Mission-354", "Saturn", "JAXA", 4540.0, LocalDateTime.of(2023, 6, 18, 10, 30), LocalDateTime.of(2025, 6, 18, 9, 15), "Electric", 3770.0, "X-Band", 36400000.0, 45.4, "Magnetometer", "Thermal Sensor", 654, true, "Completed", 64.6, "Trajectory-354");
                SpaceProbeDTO probe355 = new SpaceProbeDTO(355, "Mission-355", "Mercury", "CNSA", 4550.0, LocalDateTime.of(2024, 7, 19, 10, 30), LocalDateTime.of(2026, 7, 19, 9, 15), "Solar Sail", 3775.0, "X-Band", 36500000.0, 45.5, "Thermal Sensor", "Camera", 655, false, "Standby", 64.5, "Trajectory-355");
                SpaceProbeDTO probe356 = new SpaceProbeDTO(356, "Mission-356", "Neptune", "SpaceX", 4560.0, LocalDateTime.of(2025, 8, 20, 10, 30), LocalDateTime.of(2027, 8, 20, 9, 15), "Chemical", 3780.0, "X-Band", 36600000.0, 45.6, "Camera", "Spectrometer", 656, true, "Planned", 64.4, "Trajectory-356");
                SpaceProbeDTO probe357 = new SpaceProbeDTO(357, "Mission-357", "Uranus", "Roscosmos", 4570.0, LocalDateTime.of(2026, 9, 21, 10, 30), LocalDateTime.of(2028, 9, 21, 9, 15), "Ion", 3785.0, "X-Band", 36700000.0, 45.7, "Spectrometer", "Radar", 657, false, "Active", 64.3, "Trajectory-357");
                SpaceProbeDTO probe358 = new SpaceProbeDTO(358, "Mission-358", "Pluto", "BlueOrigin", 4580.0, LocalDateTime.of(2027, 10, 22, 10, 30), LocalDateTime.of(2029, 10, 22, 9, 15), "Nuclear", 3790.0, "X-Band", 36800000.0, 45.8, "Radar", "Magnetometer", 658, true, "Completed", 64.2, "Trajectory-358");
                SpaceProbeDTO probe359 = new SpaceProbeDTO(359, "Mission-359", "Moon", "ULA", 4590.0, LocalDateTime.of(2028, 11, 23, 10, 30), LocalDateTime.of(2030, 11, 23, 9, 15), "Electric", 3795.0, "X-Band", 36900000.0, 45.9, "Magnetometer", "Thermal Sensor", 659, false, "Standby", 64.1, "Trajectory-359");
                SpaceProbeDTO probe360 = new SpaceProbeDTO(360, "Mission-360", "Europa", "Boeing", 4600.0, LocalDateTime.of(2029, 12, 24, 10, 30), LocalDateTime.of(2031, 12, 24, 9, 15), "Solar Sail", 3800.0, "X-Band", 37000000.0, 46.0, "Thermal Sensor", "Camera", 660, true, "Planned", 64.0, "Trajectory-360");
                SpaceProbeDTO probe361 = new SpaceProbeDTO(361, "Mission-361", "Mars", "NASA", 4610.0, LocalDateTime.of(2020, 1, 25, 10, 30), LocalDateTime.of(2022, 1, 25, 9, 15), "Chemical", 3805.0, "X-Band", 37100000.0, 46.1, "Camera", "Spectrometer", 661, false, "Active", 63.9, "Trajectory-361");
                SpaceProbeDTO probe362 = new SpaceProbeDTO(362, "Mission-362", "Venus", "ISRO", 4620.0, LocalDateTime.of(2021, 2, 26, 10, 30), LocalDateTime.of(2023, 2, 26, 9, 15), "Ion", 3810.0, "X-Band", 37200000.0, 46.2, "Spectrometer", "Radar", 662, true, "Completed", 63.8, "Trajectory-362");
                SpaceProbeDTO probe363 = new SpaceProbeDTO(363, "Mission-363", "Jupiter", "ESA", 4630.0, LocalDateTime.of(2022, 3, 27, 10, 30), LocalDateTime.of(2024, 3, 27, 9, 15), "Nuclear", 3815.0, "X-Band", 37300000.0, 46.3, "Radar", "Magnetometer", 663, false, "Standby", 63.7, "Trajectory-363");
                SpaceProbeDTO probe364 = new SpaceProbeDTO(364, "Mission-364", "Saturn", "JAXA", 4640.0, LocalDateTime.of(2023, 4, 28, 10, 30), LocalDateTime.of(2025, 4, 28, 9, 15), "Electric", 3820.0, "X-Band", 37400000.0, 46.4, "Magnetometer", "Thermal Sensor", 664, true, "Planned", 63.6, "Trajectory-364");
                SpaceProbeDTO probe365 = new SpaceProbeDTO(365, "Mission-365", "Mercury", "CNSA", 4650.0, LocalDateTime.of(2024, 5, 1, 10, 30), LocalDateTime.of(2026, 5, 1, 9, 15), "Solar Sail", 3825.0, "X-Band", 37500000.0, 46.5, "Thermal Sensor", "Camera", 665, false, "Active", 63.5, "Trajectory-365");
                SpaceProbeDTO probe366 = new SpaceProbeDTO(366, "Mission-366", "Neptune", "SpaceX", 4660.0, LocalDateTime.of(2025, 6, 2, 10, 30), LocalDateTime.of(2027, 6, 2, 9, 15), "Chemical", 3830.0, "X-Band", 37600000.0, 46.6, "Camera", "Spectrometer", 666, true, "Completed", 63.4, "Trajectory-366");
                SpaceProbeDTO probe367 = new SpaceProbeDTO(367, "Mission-367", "Uranus", "Roscosmos", 4670.0, LocalDateTime.of(2026, 7, 3, 10, 30), LocalDateTime.of(2028, 7, 3, 9, 15), "Ion", 3835.0, "X-Band", 37700000.0, 46.7, "Spectrometer", "Radar", 667, false, "Standby", 63.3, "Trajectory-367");
                SpaceProbeDTO probe368 = new SpaceProbeDTO(368, "Mission-368", "Pluto", "BlueOrigin", 4680.0, LocalDateTime.of(2027, 8, 4, 10, 30), LocalDateTime.of(2029, 8, 4, 9, 15), "Nuclear", 3840.0, "X-Band", 37800000.0, 46.8, "Radar", "Magnetometer", 668, true, "Planned", 63.2, "Trajectory-368");
                SpaceProbeDTO probe369 = new SpaceProbeDTO(369, "Mission-369", "Moon", "ULA", 4690.0, LocalDateTime.of(2028, 9, 5, 10, 30), LocalDateTime.of(2030, 9, 5, 9, 15), "Electric", 3845.0, "X-Band", 37900000.0, 46.9, "Magnetometer", "Thermal Sensor", 669, false, "Active", 63.1, "Trajectory-369");
                SpaceProbeDTO probe370 = new SpaceProbeDTO(370, "Mission-370", "Europa", "Boeing", 4700.0, LocalDateTime.of(2029, 10, 6, 10, 30), LocalDateTime.of(2031, 10, 6, 9, 15), "Solar Sail", 3850.0, "X-Band", 38000000.0, 47.0, "Thermal Sensor", "Camera", 670, true, "Completed", 63.0, "Trajectory-370");
                SpaceProbeDTO probe371 = new SpaceProbeDTO(371, "Mission-371", "Mars", "NASA", 4710.0, LocalDateTime.of(2020, 11, 7, 10, 30), LocalDateTime.of(2022, 11, 7, 9, 15), "Chemical", 3855.0, "X-Band", 38100000.0, 47.1, "Camera", "Spectrometer", 671, false, "Standby", 62.9, "Trajectory-371");
                SpaceProbeDTO probe372 = new SpaceProbeDTO(372, "Mission-372", "Venus", "ISRO", 4720.0, LocalDateTime.of(2021, 12, 8, 10, 30), LocalDateTime.of(2023, 12, 8, 9, 15), "Ion", 3860.0, "X-Band", 38200000.0, 47.2, "Spectrometer", "Radar", 672, true, "Planned", 62.8, "Trajectory-372");
                SpaceProbeDTO probe373 = new SpaceProbeDTO(373, "Mission-373", "Jupiter", "ESA", 4730.0, LocalDateTime.of(2022, 1, 9, 10, 30), LocalDateTime.of(2024, 1, 9, 9, 15), "Nuclear", 3865.0, "X-Band", 38300000.0, 47.3, "Radar", "Magnetometer", 673, false, "Active", 62.7, "Trajectory-373");
                SpaceProbeDTO probe374 = new SpaceProbeDTO(374, "Mission-374", "Saturn", "JAXA", 4740.0, LocalDateTime.of(2023, 2, 10, 10, 30), LocalDateTime.of(2025, 2, 10, 9, 15), "Electric", 3870.0, "X-Band", 38400000.0, 47.4, "Magnetometer", "Thermal Sensor", 674, true, "Completed", 62.6, "Trajectory-374");
                SpaceProbeDTO probe375 = new SpaceProbeDTO(375, "Mission-375", "Mercury", "CNSA", 4750.0, LocalDateTime.of(2024, 3, 11, 10, 30), LocalDateTime.of(2026, 3, 11, 9, 15), "Solar Sail", 3875.0, "X-Band", 38500000.0, 47.5, "Thermal Sensor", "Camera", 675, false, "Standby", 62.5, "Trajectory-375");
                SpaceProbeDTO probe376 = new SpaceProbeDTO(376, "Mission-376", "Neptune", "SpaceX", 4760.0, LocalDateTime.of(2025, 4, 12, 10, 30), LocalDateTime.of(2027, 4, 12, 9, 15), "Chemical", 3880.0, "X-Band", 38600000.0, 47.6, "Camera", "Spectrometer", 676, true, "Planned", 62.4, "Trajectory-376");
                SpaceProbeDTO probe377 = new SpaceProbeDTO(377, "Mission-377", "Uranus", "Roscosmos", 4770.0, LocalDateTime.of(2026, 5, 13, 10, 30), LocalDateTime.of(2028, 5, 13, 9, 15), "Ion", 3885.0, "X-Band", 38700000.0, 47.7, "Spectrometer", "Radar", 677, false, "Active", 62.3, "Trajectory-377");
                SpaceProbeDTO probe378 = new SpaceProbeDTO(378, "Mission-378", "Pluto", "BlueOrigin", 4780.0, LocalDateTime.of(2027, 6, 14, 10, 30), LocalDateTime.of(2029, 6, 14, 9, 15), "Nuclear", 3890.0, "X-Band", 38800000.0, 47.8, "Radar", "Magnetometer", 678, true, "Completed", 62.2, "Trajectory-378");
                SpaceProbeDTO probe379 = new SpaceProbeDTO(379, "Mission-379", "Moon", "ULA", 4790.0, LocalDateTime.of(2028, 7, 15, 10, 30), LocalDateTime.of(2030, 7, 15, 9, 15), "Electric", 3895.0, "X-Band", 38900000.0, 47.9, "Magnetometer", "Thermal Sensor", 679, false, "Standby", 62.1, "Trajectory-379");
                SpaceProbeDTO probe380 = new SpaceProbeDTO(380, "Mission-380", "Europa", "Boeing", 4800.0, LocalDateTime.of(2029, 8, 16, 10, 30), LocalDateTime.of(2031, 8, 16, 9, 15), "Solar Sail", 3900.0, "X-Band", 39000000.0, 48.0, "Thermal Sensor", "Camera", 680, true, "Planned", 62.0, "Trajectory-380");
                SpaceProbeDTO probe381 = new SpaceProbeDTO(381, "Mission-381", "Mars", "NASA", 4810.0, LocalDateTime.of(2020, 9, 17, 10, 30), LocalDateTime.of(2022, 9, 17, 9, 15), "Chemical", 3905.0, "X-Band", 39100000.0, 48.1, "Camera", "Spectrometer", 681, false, "Active", 61.9, "Trajectory-381");
                SpaceProbeDTO probe382 = new SpaceProbeDTO(382, "Mission-382", "Venus", "ISRO", 4820.0, LocalDateTime.of(2021, 10, 18, 10, 30), LocalDateTime.of(2023, 10, 18, 9, 15), "Ion", 3910.0, "X-Band", 39200000.0, 48.2, "Spectrometer", "Radar", 682, true, "Completed", 61.8, "Trajectory-382");
                SpaceProbeDTO probe383 = new SpaceProbeDTO(383, "Mission-383", "Jupiter", "ESA", 4830.0, LocalDateTime.of(2022, 11, 19, 10, 30), LocalDateTime.of(2024, 11, 19, 9, 15), "Nuclear", 3915.0, "X-Band", 39300000.0, 48.3, "Radar", "Magnetometer", 683, false, "Standby", 61.7, "Trajectory-383");
                SpaceProbeDTO probe384 = new SpaceProbeDTO(384, "Mission-384", "Saturn", "JAXA", 4840.0, LocalDateTime.of(2023, 12, 20, 10, 30), LocalDateTime.of(2025, 12, 20, 9, 15), "Electric", 3920.0, "X-Band", 39400000.0, 48.4, "Magnetometer", "Thermal Sensor", 684, true, "Planned", 61.6, "Trajectory-384");
                SpaceProbeDTO probe385 = new SpaceProbeDTO(385, "Mission-385", "Mercury", "CNSA", 4850.0, LocalDateTime.of(2024, 1, 21, 10, 30), LocalDateTime.of(2026, 1, 21, 9, 15), "Solar Sail", 3925.0, "X-Band", 39500000.0, 48.5, "Thermal Sensor", "Camera", 685, false, "Active", 61.5, "Trajectory-385");
                SpaceProbeDTO probe386 = new SpaceProbeDTO(386, "Mission-386", "Neptune", "SpaceX", 4860.0, LocalDateTime.of(2025, 2, 22, 10, 30), LocalDateTime.of(2027, 2, 22, 9, 15), "Chemical", 3930.0, "X-Band", 39600000.0, 48.6, "Camera", "Spectrometer", 686, true, "Completed", 61.4, "Trajectory-386");
                SpaceProbeDTO probe387 = new SpaceProbeDTO(387, "Mission-387", "Uranus", "Roscosmos", 4870.0, LocalDateTime.of(2026, 3, 23, 10, 30), LocalDateTime.of(2028, 3, 23, 9, 15), "Ion", 3935.0, "X-Band", 39700000.0, 48.7, "Spectrometer", "Radar", 687, false, "Standby", 61.3, "Trajectory-387");
                SpaceProbeDTO probe388 = new SpaceProbeDTO(388, "Mission-388", "Pluto", "BlueOrigin", 4880.0, LocalDateTime.of(2027, 4, 24, 10, 30), LocalDateTime.of(2029, 4, 24, 9, 15), "Nuclear", 3940.0, "X-Band", 39800000.0, 48.8, "Radar", "Magnetometer", 688, true, "Planned", 61.2, "Trajectory-388");
                SpaceProbeDTO probe389 = new SpaceProbeDTO(389, "Mission-389", "Moon", "ULA", 4890.0, LocalDateTime.of(2028, 5, 25, 10, 30), LocalDateTime.of(2030, 5, 25, 9, 15), "Electric", 3945.0, "X-Band", 39900000.0, 48.9, "Magnetometer", "Thermal Sensor", 689, false, "Active", 61.1, "Trajectory-389");
                SpaceProbeDTO probe390 = new SpaceProbeDTO(390, "Mission-390", "Europa", "Boeing", 4900.0, LocalDateTime.of(2029, 6, 26, 10, 30), LocalDateTime.of(2031, 6, 26, 9, 15), "Solar Sail", 3950.0, "X-Band", 40000000.0, 49.0, "Thermal Sensor", "Camera", 690, true, "Completed", 61.0, "Trajectory-390");
                SpaceProbeDTO probe391 = new SpaceProbeDTO(391, "Mission-391", "Mars", "NASA", 4910.0, LocalDateTime.of(2020, 7, 27, 10, 30), LocalDateTime.of(2022, 7, 27, 9, 15), "Chemical", 3955.0, "X-Band", 40100000.0, 49.1, "Camera", "Spectrometer", 691, false, "Standby", 60.9, "Trajectory-391");
                SpaceProbeDTO probe392 = new SpaceProbeDTO(392, "Mission-392", "Venus", "ISRO", 4920.0, LocalDateTime.of(2021, 8, 28, 10, 30), LocalDateTime.of(2023, 8, 28, 9, 15), "Ion", 3960.0, "X-Band", 40200000.0, 49.2, "Spectrometer", "Radar", 692, true, "Planned", 60.8, "Trajectory-392");
                SpaceProbeDTO probe393 = new SpaceProbeDTO(393, "Mission-393", "Jupiter", "ESA", 4930.0, LocalDateTime.of(2022, 9, 1, 10, 30), LocalDateTime.of(2024, 9, 1, 9, 15), "Nuclear", 3965.0, "X-Band", 40300000.0, 49.3, "Radar", "Magnetometer", 693, false, "Active", 60.7, "Trajectory-393");
                SpaceProbeDTO probe394 = new SpaceProbeDTO(394, "Mission-394", "Saturn", "JAXA", 4940.0, LocalDateTime.of(2023, 10, 2, 10, 30), LocalDateTime.of(2025, 10, 2, 9, 15), "Electric", 3970.0, "X-Band", 40400000.0, 49.4, "Magnetometer", "Thermal Sensor", 694, true, "Completed", 60.6, "Trajectory-394");
                SpaceProbeDTO probe395 = new SpaceProbeDTO(395, "Mission-395", "Mercury", "CNSA", 4950.0, LocalDateTime.of(2024, 11, 3, 10, 30), LocalDateTime.of(2026, 11, 3, 9, 15), "Solar Sail", 3975.0, "X-Band", 40500000.0, 49.5, "Thermal Sensor", "Camera", 695, false, "Standby", 60.5, "Trajectory-395");
                SpaceProbeDTO probe396 = new SpaceProbeDTO(396, "Mission-396", "Neptune", "SpaceX", 4960.0, LocalDateTime.of(2025, 12, 4, 10, 30), LocalDateTime.of(2027, 12, 4, 9, 15), "Chemical", 3980.0, "X-Band", 40600000.0, 49.6, "Camera", "Spectrometer", 696, true, "Planned", 60.4, "Trajectory-396");
                SpaceProbeDTO probe397 = new SpaceProbeDTO(397, "Mission-397", "Uranus", "Roscosmos", 4970.0, LocalDateTime.of(2026, 1, 5, 10, 30), LocalDateTime.of(2028, 1, 5, 9, 15), "Ion", 3985.0, "X-Band", 40700000.0, 49.7, "Spectrometer", "Radar", 697, false, "Active", 60.3, "Trajectory-397");
                SpaceProbeDTO probe398 = new SpaceProbeDTO(398, "Mission-398", "Pluto", "BlueOrigin", 4980.0, LocalDateTime.of(2027, 2, 6, 10, 30), LocalDateTime.of(2029, 2, 6, 9, 15), "Nuclear", 3990.0, "X-Band", 40800000.0, 49.8, "Radar", "Magnetometer", 698, true, "Completed", 60.2, "Trajectory-398");
                SpaceProbeDTO probe399 = new SpaceProbeDTO(399, "Mission-399", "Moon", "ULA", 4990.0, LocalDateTime.of(2028, 3, 7, 10, 30), LocalDateTime.of(2030, 3, 7, 9, 15), "Electric", 3995.0, "X-Band", 40900000.0, 49.9, "Magnetometer", "Thermal Sensor", 699, false, "Standby", 60.1, "Trajectory-399");
                SpaceProbeDTO probe400 = new SpaceProbeDTO(400, "Mission-400", "Europa", "Boeing", 5000.0, LocalDateTime.of(2029, 4, 8, 10, 30), LocalDateTime.of(2031, 4, 8, 9, 15), "Solar Sail", 4000.0, "X-Band", 41000000.0, 50.0, "Thermal Sensor", "Camera", 700, true, "Planned", 60.0, "Trajectory-400");
                SpaceProbeDTO probe401 = new SpaceProbeDTO(401, "Mission-401", "Mars", "NASA", 5010.0, LocalDateTime.of(2020, 5, 9, 10, 30), LocalDateTime.of(2022, 5, 9, 9, 15), "Chemical", 4005.0, "X-Band", 41100000.0, 50.1, "Camera", "Spectrometer", 701, false, "Active", 59.9, "Trajectory-401");
                SpaceProbeDTO probe402 = new SpaceProbeDTO(402, "Mission-402", "Venus", "ISRO", 5020.0, LocalDateTime.of(2021, 6, 10, 10, 30), LocalDateTime.of(2023, 6, 10, 9, 15), "Ion", 4010.0, "X-Band", 41200000.0, 50.2, "Spectrometer", "Radar", 702, true, "Completed", 59.8, "Trajectory-402");
                SpaceProbeDTO probe403 = new SpaceProbeDTO(403, "Mission-403", "Jupiter", "ESA", 5030.0, LocalDateTime.of(2022, 7, 11, 10, 30), LocalDateTime.of(2024, 7, 11, 9, 15), "Nuclear", 4015.0, "X-Band", 41300000.0, 50.3, "Radar", "Magnetometer", 703, false, "Standby", 59.7, "Trajectory-403");
                SpaceProbeDTO probe404 = new SpaceProbeDTO(404, "Mission-404", "Saturn", "JAXA", 5040.0, LocalDateTime.of(2023, 8, 12, 10, 30), LocalDateTime.of(2025, 8, 12, 9, 15), "Electric", 4020.0, "X-Band", 41400000.0, 50.4, "Magnetometer", "Thermal Sensor", 704, true, "Planned", 59.6, "Trajectory-404");
                SpaceProbeDTO probe405 = new SpaceProbeDTO(405, "Mission-405", "Mercury", "CNSA", 5050.0, LocalDateTime.of(2024, 9, 13, 10, 30), LocalDateTime.of(2026, 9, 13, 9, 15), "Solar Sail", 4025.0, "X-Band", 41500000.0, 50.5, "Thermal Sensor", "Camera", 705, false, "Active", 59.5, "Trajectory-405");
                SpaceProbeDTO probe406 = new SpaceProbeDTO(406, "Mission-406", "Neptune", "SpaceX", 5060.0, LocalDateTime.of(2025, 10, 14, 10, 30), LocalDateTime.of(2027, 10, 14, 9, 15), "Chemical", 4030.0, "X-Band", 41600000.0, 50.6, "Camera", "Spectrometer", 706, true, "Completed", 59.4, "Trajectory-406");
                SpaceProbeDTO probe407 = new SpaceProbeDTO(407, "Mission-407", "Uranus", "Roscosmos", 5070.0, LocalDateTime.of(2026, 11, 15, 10, 30), LocalDateTime.of(2028, 11, 15, 9, 15), "Ion", 4035.0, "X-Band", 41700000.0, 50.7, "Spectrometer", "Radar", 707, false, "Standby", 59.3, "Trajectory-407");
                SpaceProbeDTO probe408 = new SpaceProbeDTO(408, "Mission-408", "Pluto", "BlueOrigin", 5080.0, LocalDateTime.of(2027, 12, 16, 10, 30), LocalDateTime.of(2029, 12, 16, 9, 15), "Nuclear", 4040.0, "X-Band", 41800000.0, 50.8, "Radar", "Magnetometer", 708, true, "Planned", 59.2, "Trajectory-408");
                SpaceProbeDTO probe409 = new SpaceProbeDTO(409, "Mission-409", "Moon", "ULA", 5090.0, LocalDateTime.of(2028, 1, 17, 10, 30), LocalDateTime.of(2030, 1, 17, 9, 15), "Electric", 4045.0, "X-Band", 41900000.0, 50.9, "Magnetometer", "Thermal Sensor", 709, false, "Active", 59.1, "Trajectory-409");
                SpaceProbeDTO probe410 = new SpaceProbeDTO(410, "Mission-410", "Europa", "Boeing", 5100.0, LocalDateTime.of(2029, 2, 18, 10, 30), LocalDateTime.of(2031, 2, 18, 9, 15), "Solar Sail", 4050.0, "X-Band", 42000000.0, 51.0, "Thermal Sensor", "Camera", 710, true, "Completed", 59.0, "Trajectory-410");
                SpaceProbeDTO probe411 = new SpaceProbeDTO(411, "Mission-411", "Mars", "NASA", 5110.0, LocalDateTime.of(2020, 3, 19, 10, 30), LocalDateTime.of(2022, 3, 19, 9, 15), "Chemical", 4055.0, "X-Band", 42100000.0, 51.1, "Camera", "Spectrometer", 711, false, "Standby", 58.9, "Trajectory-411");
                SpaceProbeDTO probe412 = new SpaceProbeDTO(412, "Mission-412", "Venus", "ISRO", 5120.0, LocalDateTime.of(2021, 4, 20, 10, 30), LocalDateTime.of(2023, 4, 20, 9, 15), "Ion", 4060.0, "X-Band", 42200000.0, 51.2, "Spectrometer", "Radar", 712, true, "Planned", 58.8, "Trajectory-412");
                SpaceProbeDTO probe413 = new SpaceProbeDTO(413, "Mission-413", "Jupiter", "ESA", 5130.0, LocalDateTime.of(2022, 5, 21, 10, 30), LocalDateTime.of(2024, 5, 21, 9, 15), "Nuclear", 4065.0, "X-Band", 42300000.0, 51.3, "Radar", "Magnetometer", 713, false, "Active", 58.7, "Trajectory-413");
                SpaceProbeDTO probe414 = new SpaceProbeDTO(414, "Mission-414", "Saturn", "JAXA", 5140.0, LocalDateTime.of(2023, 6, 22, 10, 30), LocalDateTime.of(2025, 6, 22, 9, 15), "Electric", 4070.0, "X-Band", 42400000.0, 51.4, "Magnetometer", "Thermal Sensor", 714, true, "Completed", 58.6, "Trajectory-414");
                SpaceProbeDTO probe415 = new SpaceProbeDTO(415, "Mission-415", "Mercury", "CNSA", 5150.0, LocalDateTime.of(2024, 7, 23, 10, 30), LocalDateTime.of(2026, 7, 23, 9, 15), "Solar Sail", 4075.0, "X-Band", 42500000.0, 51.5, "Thermal Sensor", "Camera", 715, false, "Standby", 58.5, "Trajectory-415");
                SpaceProbeDTO probe416 = new SpaceProbeDTO(416, "Mission-416", "Neptune", "SpaceX", 5160.0, LocalDateTime.of(2025, 8, 24, 10, 30), LocalDateTime.of(2027, 8, 24, 9, 15), "Chemical", 4080.0, "X-Band", 42600000.0, 51.6, "Camera", "Spectrometer", 716, true, "Planned", 58.4, "Trajectory-416");
                SpaceProbeDTO probe417 = new SpaceProbeDTO(417, "Mission-417", "Uranus", "Roscosmos", 5170.0, LocalDateTime.of(2026, 9, 25, 10, 30), LocalDateTime.of(2028, 9, 25, 9, 15), "Ion", 4085.0, "X-Band", 42700000.0, 51.7, "Spectrometer", "Radar", 717, false, "Active", 58.3, "Trajectory-417");
                SpaceProbeDTO probe418 = new SpaceProbeDTO(418, "Mission-418", "Pluto", "BlueOrigin", 5180.0, LocalDateTime.of(2027, 10, 26, 10, 30), LocalDateTime.of(2029, 10, 26, 9, 15), "Nuclear", 4090.0, "X-Band", 42800000.0, 51.8, "Radar", "Magnetometer", 718, true, "Completed", 58.2, "Trajectory-418");
                SpaceProbeDTO probe419 = new SpaceProbeDTO(419, "Mission-419", "Moon", "ULA", 5190.0, LocalDateTime.of(2028, 11, 27, 10, 30), LocalDateTime.of(2030, 11, 27, 9, 15), "Electric", 4095.0, "X-Band", 42900000.0, 51.9, "Magnetometer", "Thermal Sensor", 719, false, "Standby", 58.1, "Trajectory-419");
                SpaceProbeDTO probe420 = new SpaceProbeDTO(420, "Mission-420", "Europa", "Boeing", 5200.0, LocalDateTime.of(2029, 12, 28, 10, 30), LocalDateTime.of(2031, 12, 28, 9, 15), "Solar Sail", 4100.0, "X-Band", 43000000.0, 52.0, "Thermal Sensor", "Camera", 720, true, "Planned", 58.0, "Trajectory-420");
                SpaceProbeDTO probe421 = new SpaceProbeDTO(421, "Mission-421", "Mars", "NASA", 5210.0, LocalDateTime.of(2020, 1, 1, 10, 30), LocalDateTime.of(2022, 1, 1, 9, 15), "Chemical", 4105.0, "X-Band", 43100000.0, 52.1, "Camera", "Spectrometer", 721, false, "Active", 57.9, "Trajectory-421");
                SpaceProbeDTO probe422 = new SpaceProbeDTO(422, "Mission-422", "Venus", "ISRO", 5220.0, LocalDateTime.of(2021, 2, 2, 10, 30), LocalDateTime.of(2023, 2, 2, 9, 15), "Ion", 4110.0, "X-Band", 43200000.0, 52.2, "Spectrometer", "Radar", 722, true, "Completed", 57.8, "Trajectory-422");
                SpaceProbeDTO probe423 = new SpaceProbeDTO(423, "Mission-423", "Jupiter", "ESA", 5230.0, LocalDateTime.of(2022, 3, 3, 10, 30), LocalDateTime.of(2024, 3, 3, 9, 15), "Nuclear", 4115.0, "X-Band", 43300000.0, 52.3, "Radar", "Magnetometer", 723, false, "Standby", 57.7, "Trajectory-423");
                SpaceProbeDTO probe424 = new SpaceProbeDTO(424, "Mission-424", "Saturn", "JAXA", 5240.0, LocalDateTime.of(2023, 4, 4, 10, 30), LocalDateTime.of(2025, 4, 4, 9, 15), "Electric", 4120.0, "X-Band", 43400000.0, 52.4, "Magnetometer", "Thermal Sensor", 724, true, "Planned", 57.6, "Trajectory-424");
                SpaceProbeDTO probe425 = new SpaceProbeDTO(425, "Mission-425", "Mercury", "CNSA", 5250.0, LocalDateTime.of(2024, 5, 5, 10, 30), LocalDateTime.of(2026, 5, 5, 9, 15), "Solar Sail", 4125.0, "X-Band", 43500000.0, 52.5, "Thermal Sensor", "Camera", 725, false, "Active", 57.5, "Trajectory-425");
                SpaceProbeDTO probe426 = new SpaceProbeDTO(426, "Mission-426", "Neptune", "SpaceX", 5260.0, LocalDateTime.of(2025, 6, 6, 10, 30), LocalDateTime.of(2027, 6, 6, 9, 15), "Chemical", 4130.0, "X-Band", 43600000.0, 52.6, "Camera", "Spectrometer", 726, true, "Completed", 57.4, "Trajectory-426");
                SpaceProbeDTO probe427 = new SpaceProbeDTO(427, "Mission-427", "Uranus", "Roscosmos", 5270.0, LocalDateTime.of(2026, 7, 7, 10, 30), LocalDateTime.of(2028, 7, 7, 9, 15), "Ion", 4135.0, "X-Band", 43700000.0, 52.7, "Spectrometer", "Radar", 727, false, "Standby", 57.3, "Trajectory-427");
                SpaceProbeDTO probe428 = new SpaceProbeDTO(428, "Mission-428", "Pluto", "BlueOrigin", 5280.0, LocalDateTime.of(2027, 8, 8, 10, 30), LocalDateTime.of(2029, 8, 8, 9, 15), "Nuclear", 4140.0, "X-Band", 43800000.0, 52.8, "Radar", "Magnetometer", 728, true, "Planned", 57.2, "Trajectory-428");
                SpaceProbeDTO probe429 = new SpaceProbeDTO(429, "Mission-429", "Moon", "ULA", 5290.0, LocalDateTime.of(2028, 9, 9, 10, 30), LocalDateTime.of(2030, 9, 9, 9, 15), "Electric", 4145.0, "X-Band", 43900000.0, 52.9, "Magnetometer", "Thermal Sensor", 729, false, "Active", 57.1, "Trajectory-429");
                SpaceProbeDTO probe430 = new SpaceProbeDTO(430, "Mission-430", "Europa", "Boeing", 5300.0, LocalDateTime.of(2029, 10, 10, 10, 30), LocalDateTime.of(2031, 10, 10, 9, 15), "Solar Sail", 4150.0, "X-Band", 44000000.0, 53.0, "Thermal Sensor", "Camera", 730, true, "Completed", 57.0, "Trajectory-430");
                SpaceProbeDTO probe431 = new SpaceProbeDTO(431, "Mission-431", "Mars", "NASA", 5310.0, LocalDateTime.of(2020, 11, 11, 10, 30), LocalDateTime.of(2022, 11, 11, 9, 15), "Chemical", 4155.0, "X-Band", 44100000.0, 53.1, "Camera", "Spectrometer", 731, false, "Standby", 56.9, "Trajectory-431");
                SpaceProbeDTO probe432 = new SpaceProbeDTO(432, "Mission-432", "Venus", "ISRO", 5320.0, LocalDateTime.of(2021, 12, 12, 10, 30), LocalDateTime.of(2023, 12, 12, 9, 15), "Ion", 4160.0, "X-Band", 44200000.0, 53.2, "Spectrometer", "Radar", 732, true, "Planned", 56.8, "Trajectory-432");
                SpaceProbeDTO probe433 = new SpaceProbeDTO(433, "Mission-433", "Jupiter", "ESA", 5330.0, LocalDateTime.of(2022, 1, 13, 10, 30), LocalDateTime.of(2024, 1, 13, 9, 15), "Nuclear", 4165.0, "X-Band", 44300000.0, 53.3, "Radar", "Magnetometer", 733, false, "Active", 56.7, "Trajectory-433");
                SpaceProbeDTO probe434 = new SpaceProbeDTO(434, "Mission-434", "Saturn", "JAXA", 5340.0, LocalDateTime.of(2023, 2, 14, 10, 30), LocalDateTime.of(2025, 2, 14, 9, 15), "Electric", 4170.0, "X-Band", 44400000.0, 53.4, "Magnetometer", "Thermal Sensor", 734, true, "Completed", 56.6, "Trajectory-434");
                SpaceProbeDTO probe435 = new SpaceProbeDTO(435, "Mission-435", "Mercury", "CNSA", 5350.0, LocalDateTime.of(2024, 3, 15, 10, 30), LocalDateTime.of(2026, 3, 15, 9, 15), "Solar Sail", 4175.0, "X-Band", 44500000.0, 53.5, "Thermal Sensor", "Camera", 735, false, "Standby", 56.5, "Trajectory-435");
                SpaceProbeDTO probe436 = new SpaceProbeDTO(436, "Mission-436", "Neptune", "SpaceX", 5360.0, LocalDateTime.of(2025, 4, 16, 10, 30), LocalDateTime.of(2027, 4, 16, 9, 15), "Chemical", 4180.0, "X-Band", 44600000.0, 53.6, "Camera", "Spectrometer", 736, true, "Planned", 56.4, "Trajectory-436");
                SpaceProbeDTO probe437 = new SpaceProbeDTO(437, "Mission-437", "Uranus", "Roscosmos", 5370.0, LocalDateTime.of(2026, 5, 17, 10, 30), LocalDateTime.of(2028, 5, 17, 9, 15), "Ion", 4185.0, "X-Band", 44700000.0, 53.7, "Spectrometer", "Radar", 737, false, "Active", 56.3, "Trajectory-437");
                SpaceProbeDTO probe438 = new SpaceProbeDTO(438, "Mission-438", "Pluto", "BlueOrigin", 5380.0, LocalDateTime.of(2027, 6, 18, 10, 30), LocalDateTime.of(2029, 6, 18, 9, 15), "Nuclear", 4190.0, "X-Band", 44800000.0, 53.8, "Radar", "Magnetometer", 738, true, "Completed", 56.2, "Trajectory-438");
                SpaceProbeDTO probe439 = new SpaceProbeDTO(439, "Mission-439", "Moon", "ULA", 5390.0, LocalDateTime.of(2028, 7, 19, 10, 30), LocalDateTime.of(2030, 7, 19, 9, 15), "Electric", 4195.0, "X-Band", 44900000.0, 53.9, "Magnetometer", "Thermal Sensor", 739, false, "Standby", 56.1, "Trajectory-439");
                SpaceProbeDTO probe440 = new SpaceProbeDTO(440, "Mission-440", "Europa", "Boeing", 5400.0, LocalDateTime.of(2029, 8, 20, 10, 30), LocalDateTime.of(2031, 8, 20, 9, 15), "Solar Sail", 4200.0, "X-Band", 45000000.0, 54.0, "Thermal Sensor", "Camera", 740, true, "Planned", 56.0, "Trajectory-440");
                SpaceProbeDTO probe441 = new SpaceProbeDTO(441, "Mission-441", "Mars", "NASA", 5410.0, LocalDateTime.of(2020, 9, 21, 10, 30), LocalDateTime.of(2022, 9, 21, 9, 15), "Chemical", 4205.0, "X-Band", 45100000.0, 54.1, "Camera", "Spectrometer", 741, false, "Active", 55.9, "Trajectory-441");
                SpaceProbeDTO probe442 = new SpaceProbeDTO(442, "Mission-442", "Venus", "ISRO", 5420.0, LocalDateTime.of(2021, 10, 22, 10, 30), LocalDateTime.of(2023, 10, 22, 9, 15), "Ion", 4210.0, "X-Band", 45200000.0, 54.2, "Spectrometer", "Radar", 742, true, "Completed", 55.8, "Trajectory-442");
                SpaceProbeDTO probe443 = new SpaceProbeDTO(443, "Mission-443", "Jupiter", "ESA", 5430.0, LocalDateTime.of(2022, 11, 23, 10, 30), LocalDateTime.of(2024, 11, 23, 9, 15), "Nuclear", 4215.0, "X-Band", 45300000.0, 54.3, "Radar", "Magnetometer", 743, false, "Standby", 55.7, "Trajectory-443");
                SpaceProbeDTO probe444 = new SpaceProbeDTO(444, "Mission-444", "Saturn", "JAXA", 5440.0, LocalDateTime.of(2023, 12, 24, 10, 30), LocalDateTime.of(2025, 12, 24, 9, 15), "Electric", 4220.0, "X-Band", 45400000.0, 54.4, "Magnetometer", "Thermal Sensor", 744, true, "Planned", 55.6, "Trajectory-444");
                SpaceProbeDTO probe445 = new SpaceProbeDTO(445, "Mission-445", "Mercury", "CNSA", 5450.0, LocalDateTime.of(2024, 1, 25, 10, 30), LocalDateTime.of(2026, 1, 25, 9, 15), "Solar Sail", 4225.0, "X-Band", 45500000.0, 54.5, "Thermal Sensor", "Camera", 745, false, "Active", 55.5, "Trajectory-445");
                SpaceProbeDTO probe446 = new SpaceProbeDTO(446, "Mission-446", "Neptune", "SpaceX", 5460.0, LocalDateTime.of(2025, 2, 26, 10, 30), LocalDateTime.of(2027, 2, 26, 9, 15), "Chemical", 4230.0, "X-Band", 45600000.0, 54.6, "Camera", "Spectrometer", 746, true, "Completed", 55.4, "Trajectory-446");
                SpaceProbeDTO probe447 = new SpaceProbeDTO(447, "Mission-447", "Uranus", "Roscosmos", 5470.0, LocalDateTime.of(2026, 3, 27, 10, 30), LocalDateTime.of(2028, 3, 27, 9, 15), "Ion", 4235.0, "X-Band", 45700000.0, 54.7, "Spectrometer", "Radar", 747, false, "Standby", 55.3, "Trajectory-447");
                SpaceProbeDTO probe448 = new SpaceProbeDTO(448, "Mission-448", "Pluto", "BlueOrigin", 5480.0, LocalDateTime.of(2027, 4, 28, 10, 30), LocalDateTime.of(2029, 4, 28, 9, 15), "Nuclear", 4240.0, "X-Band", 45800000.0, 54.8, "Radar", "Magnetometer", 748, true, "Planned", 55.2, "Trajectory-448");
                SpaceProbeDTO probe449 = new SpaceProbeDTO(449, "Mission-449", "Moon", "ULA", 5490.0, LocalDateTime.of(2028, 5, 1, 10, 30), LocalDateTime.of(2030, 5, 1, 9, 15), "Electric", 4245.0, "X-Band", 45900000.0, 54.9, "Magnetometer", "Thermal Sensor", 749, false, "Active", 55.1, "Trajectory-449");
                SpaceProbeDTO probe450 = new SpaceProbeDTO(450, "Mission-450", "Europa", "Boeing", 5500.0, LocalDateTime.of(2029, 6, 2, 10, 30), LocalDateTime.of(2031, 6, 2, 9, 15), "Solar Sail", 4250.0, "X-Band", 46000000.0, 55.0, "Thermal Sensor", "Camera", 750, true, "Completed", 55.0, "Trajectory-450");
                SpaceProbeDTO probe451 = new SpaceProbeDTO(451, "Mission-451", "Mars", "NASA", 5510.0, LocalDateTime.of(2020, 7, 3, 10, 30), LocalDateTime.of(2022, 7, 3, 9, 15), "Chemical", 4255.0, "X-Band", 46100000.0, 55.1, "Camera", "Spectrometer", 751, false, "Standby", 54.9, "Trajectory-451");
                SpaceProbeDTO probe452 = new SpaceProbeDTO(452, "Mission-452", "Venus", "ISRO", 5520.0, LocalDateTime.of(2021, 8, 4, 10, 30), LocalDateTime.of(2023, 8, 4, 9, 15), "Ion", 4260.0, "X-Band", 46200000.0, 55.2, "Spectrometer", "Radar", 752, true, "Planned", 54.8, "Trajectory-452");
                SpaceProbeDTO probe453 = new SpaceProbeDTO(453, "Mission-453", "Jupiter", "ESA", 5530.0, LocalDateTime.of(2022, 9, 5, 10, 30), LocalDateTime.of(2024, 9, 5, 9, 15), "Nuclear", 4265.0, "X-Band", 46300000.0, 55.3, "Radar", "Magnetometer", 753, false, "Active", 54.7, "Trajectory-453");
                SpaceProbeDTO probe454 = new SpaceProbeDTO(454, "Mission-454", "Saturn", "JAXA", 5540.0, LocalDateTime.of(2023, 10, 6, 10, 30), LocalDateTime.of(2025, 10, 6, 9, 15), "Electric", 4270.0, "X-Band", 46400000.0, 55.4, "Magnetometer", "Thermal Sensor", 754, true, "Completed", 54.6, "Trajectory-454");
                SpaceProbeDTO probe455 = new SpaceProbeDTO(455, "Mission-455", "Mercury", "CNSA", 5550.0, LocalDateTime.of(2024, 11, 7, 10, 30), LocalDateTime.of(2026, 11, 7, 9, 15), "Solar Sail", 4275.0, "X-Band", 46500000.0, 55.5, "Thermal Sensor", "Camera", 755, false, "Standby", 54.5, "Trajectory-455");
                SpaceProbeDTO probe456 = new SpaceProbeDTO(456, "Mission-456", "Neptune", "SpaceX", 5560.0, LocalDateTime.of(2025, 12, 8, 10, 30), LocalDateTime.of(2027, 12, 8, 9, 15), "Chemical", 4280.0, "X-Band", 46600000.0, 55.6, "Camera", "Spectrometer", 756, true, "Planned", 54.4, "Trajectory-456");
                SpaceProbeDTO probe457 = new SpaceProbeDTO(457, "Mission-457", "Uranus", "Roscosmos", 5570.0, LocalDateTime.of(2026, 1, 9, 10, 30), LocalDateTime.of(2028, 1, 9, 9, 15), "Ion", 4285.0, "X-Band", 46700000.0, 55.7, "Spectrometer", "Radar", 757, false, "Active", 54.3, "Trajectory-457");
                SpaceProbeDTO probe458 = new SpaceProbeDTO(458, "Mission-458", "Pluto", "BlueOrigin", 5580.0, LocalDateTime.of(2027, 2, 10, 10, 30), LocalDateTime.of(2029, 2, 10, 9, 15), "Nuclear", 4290.0, "X-Band", 46800000.0, 55.8, "Radar", "Magnetometer", 758, true, "Completed", 54.2, "Trajectory-458");
                SpaceProbeDTO probe459 = new SpaceProbeDTO(459, "Mission-459", "Moon", "ULA", 5590.0, LocalDateTime.of(2028, 3, 11, 10, 30), LocalDateTime.of(2030, 3, 11, 9, 15), "Electric", 4295.0, "X-Band", 46900000.0, 55.9, "Magnetometer", "Thermal Sensor", 759, false, "Standby", 54.1, "Trajectory-459");
                SpaceProbeDTO probe460 = new SpaceProbeDTO(460, "Mission-460", "Europa", "Boeing", 5600.0, LocalDateTime.of(2029, 4, 12, 10, 30), LocalDateTime.of(2031, 4, 12, 9, 15), "Solar Sail", 4300.0, "X-Band", 47000000.0, 56.0, "Thermal Sensor", "Camera", 760, true, "Planned", 54.0, "Trajectory-460");
                SpaceProbeDTO probe461 = new SpaceProbeDTO(461, "Mission-461", "Mars", "NASA", 5610.0, LocalDateTime.of(2020, 5, 13, 10, 30), LocalDateTime.of(2022, 5, 13, 9, 15), "Chemical", 4305.0, "X-Band", 47100000.0, 56.1, "Camera", "Spectrometer", 761, false, "Active", 53.9, "Trajectory-461");
                SpaceProbeDTO probe462 = new SpaceProbeDTO(462, "Mission-462", "Venus", "ISRO", 5620.0, LocalDateTime.of(2021, 6, 14, 10, 30), LocalDateTime.of(2023, 6, 14, 9, 15), "Ion", 4310.0, "X-Band", 47200000.0, 56.2, "Spectrometer", "Radar", 762, true, "Completed", 53.8, "Trajectory-462");
                SpaceProbeDTO probe463 = new SpaceProbeDTO(463, "Mission-463", "Jupiter", "ESA", 5630.0, LocalDateTime.of(2022, 7, 15, 10, 30), LocalDateTime.of(2024, 7, 15, 9, 15), "Nuclear", 4315.0, "X-Band", 47300000.0, 56.3, "Radar", "Magnetometer", 763, false, "Standby", 53.7, "Trajectory-463");
                SpaceProbeDTO probe464 = new SpaceProbeDTO(464, "Mission-464", "Saturn", "JAXA", 5640.0, LocalDateTime.of(2023, 8, 16, 10, 30), LocalDateTime.of(2025, 8, 16, 9, 15), "Electric", 4320.0, "X-Band", 47400000.0, 56.4, "Magnetometer", "Thermal Sensor", 764, true, "Planned", 53.6, "Trajectory-464");
                SpaceProbeDTO probe465 = new SpaceProbeDTO(465, "Mission-465", "Mercury", "CNSA", 5650.0, LocalDateTime.of(2024, 9, 17, 10, 30), LocalDateTime.of(2026, 9, 17, 9, 15), "Solar Sail", 4325.0, "X-Band", 47500000.0, 56.5, "Thermal Sensor", "Camera", 765, false, "Active", 53.5, "Trajectory-465");
                SpaceProbeDTO probe466 = new SpaceProbeDTO(466, "Mission-466", "Neptune", "SpaceX", 5660.0, LocalDateTime.of(2025, 10, 18, 10, 30), LocalDateTime.of(2027, 10, 18, 9, 15), "Chemical", 4330.0, "X-Band", 47600000.0, 56.6, "Camera", "Spectrometer", 766, true, "Completed", 53.4, "Trajectory-466");
                SpaceProbeDTO probe467 = new SpaceProbeDTO(467, "Mission-467", "Uranus", "Roscosmos", 5670.0, LocalDateTime.of(2026, 11, 19, 10, 30), LocalDateTime.of(2028, 11, 19, 9, 15), "Ion", 4335.0, "X-Band", 47700000.0, 56.7, "Spectrometer", "Radar", 767, false, "Standby", 53.3, "Trajectory-467");
                SpaceProbeDTO probe468 = new SpaceProbeDTO(468, "Mission-468", "Pluto", "BlueOrigin", 5680.0, LocalDateTime.of(2027, 12, 20, 10, 30), LocalDateTime.of(2029, 12, 20, 9, 15), "Nuclear", 4340.0, "X-Band", 47800000.0, 56.8, "Radar", "Magnetometer", 768, true, "Planned", 53.2, "Trajectory-468");
                SpaceProbeDTO probe469 = new SpaceProbeDTO(469, "Mission-469", "Moon", "ULA", 5690.0, LocalDateTime.of(2028, 1, 21, 10, 30), LocalDateTime.of(2030, 1, 21, 9, 15), "Electric", 4345.0, "X-Band", 47900000.0, 56.9, "Magnetometer", "Thermal Sensor", 769, false, "Active", 53.1, "Trajectory-469");
                SpaceProbeDTO probe470 = new SpaceProbeDTO(470, "Mission-470", "Europa", "Boeing", 5700.0, LocalDateTime.of(2029, 2, 22, 10, 30), LocalDateTime.of(2031, 2, 22, 9, 15), "Solar Sail", 4350.0, "X-Band", 48000000.0, 57.0, "Thermal Sensor", "Camera", 770, true, "Completed", 53.0, "Trajectory-470");
                SpaceProbeDTO probe471 = new SpaceProbeDTO(471, "Mission-471", "Mars", "NASA", 5710.0, LocalDateTime.of(2020, 3, 23, 10, 30), LocalDateTime.of(2022, 3, 23, 9, 15), "Chemical", 4355.0, "X-Band", 48100000.0, 57.1, "Camera", "Spectrometer", 771, false, "Standby", 52.9, "Trajectory-471");
                SpaceProbeDTO probe472 = new SpaceProbeDTO(472, "Mission-472", "Venus", "ISRO", 5720.0, LocalDateTime.of(2021, 4, 24, 10, 30), LocalDateTime.of(2023, 4, 24, 9, 15), "Ion", 4360.0, "X-Band", 48200000.0, 57.2, "Spectrometer", "Radar", 772, true, "Planned", 52.8, "Trajectory-472");
                SpaceProbeDTO probe473 = new SpaceProbeDTO(473, "Mission-473", "Jupiter", "ESA", 5730.0, LocalDateTime.of(2022, 5, 25, 10, 30), LocalDateTime.of(2024, 5, 25, 9, 15), "Nuclear", 4365.0, "X-Band", 48300000.0, 57.3, "Radar", "Magnetometer", 773, false, "Active", 52.7, "Trajectory-473");
                SpaceProbeDTO probe474 = new SpaceProbeDTO(474, "Mission-474", "Saturn", "JAXA", 5740.0, LocalDateTime.of(2023, 6, 26, 10, 30), LocalDateTime.of(2025, 6, 26, 9, 15), "Electric", 4370.0, "X-Band", 48400000.0, 57.4, "Magnetometer", "Thermal Sensor", 774, true, "Completed", 52.6, "Trajectory-474");
                SpaceProbeDTO probe475 = new SpaceProbeDTO(475, "Mission-475", "Mercury", "CNSA", 5750.0, LocalDateTime.of(2024, 7, 27, 10, 30), LocalDateTime.of(2026, 7, 27, 9, 15), "Solar Sail", 4375.0, "X-Band", 48500000.0, 57.5, "Thermal Sensor", "Camera", 775, false, "Standby", 52.5, "Trajectory-475");
                SpaceProbeDTO probe476 = new SpaceProbeDTO(476, "Mission-476", "Neptune", "SpaceX", 5760.0, LocalDateTime.of(2025, 8, 28, 10, 30), LocalDateTime.of(2027, 8, 28, 9, 15), "Chemical", 4380.0, "X-Band", 48600000.0, 57.6, "Camera", "Spectrometer", 776, true, "Planned", 52.4, "Trajectory-476");
                SpaceProbeDTO probe477 = new SpaceProbeDTO(477, "Mission-477", "Uranus", "Roscosmos", 5770.0, LocalDateTime.of(2026, 9, 1, 10, 30), LocalDateTime.of(2028, 9, 1, 9, 15), "Ion", 4385.0, "X-Band", 48700000.0, 57.7, "Spectrometer", "Radar", 777, false, "Active", 52.3, "Trajectory-477");
                SpaceProbeDTO probe478 = new SpaceProbeDTO(478, "Mission-478", "Pluto", "BlueOrigin", 5780.0, LocalDateTime.of(2027, 10, 2, 10, 30), LocalDateTime.of(2029, 10, 2, 9, 15), "Nuclear", 4390.0, "X-Band", 48800000.0, 57.8, "Radar", "Magnetometer", 778, true, "Completed", 52.2, "Trajectory-478");
                SpaceProbeDTO probe479 = new SpaceProbeDTO(479, "Mission-479", "Moon", "ULA", 5790.0, LocalDateTime.of(2028, 11, 3, 10, 30), LocalDateTime.of(2030, 11, 3, 9, 15), "Electric", 4395.0, "X-Band", 48900000.0, 57.9, "Magnetometer", "Thermal Sensor", 779, false, "Standby", 52.1, "Trajectory-479");
                SpaceProbeDTO probe480 = new SpaceProbeDTO(480, "Mission-480", "Europa", "Boeing", 5800.0, LocalDateTime.of(2029, 12, 4, 10, 30), LocalDateTime.of(2031, 12, 4, 9, 15), "Solar Sail", 4400.0, "X-Band", 49000000.0, 58.0, "Thermal Sensor", "Camera", 780, true, "Planned", 52.0, "Trajectory-480");
                SpaceProbeDTO probe481 = new SpaceProbeDTO(481, "Mission-481", "Mars", "NASA", 5810.0, LocalDateTime.of(2020, 1, 5, 10, 30), LocalDateTime.of(2022, 1, 5, 9, 15), "Chemical", 4405.0, "X-Band", 49100000.0, 58.1, "Camera", "Spectrometer", 781, false, "Active", 51.9, "Trajectory-481");
                SpaceProbeDTO probe482 = new SpaceProbeDTO(482, "Mission-482", "Venus", "ISRO", 5820.0, LocalDateTime.of(2021, 2, 6, 10, 30), LocalDateTime.of(2023, 2, 6, 9, 15), "Ion", 4410.0, "X-Band", 49200000.0, 58.2, "Spectrometer", "Radar", 782, true, "Completed", 51.8, "Trajectory-482");
                SpaceProbeDTO probe483 = new SpaceProbeDTO(483, "Mission-483", "Jupiter", "ESA", 5830.0, LocalDateTime.of(2022, 3, 7, 10, 30), LocalDateTime.of(2024, 3, 7, 9, 15), "Nuclear", 4415.0, "X-Band", 49300000.0, 58.3, "Radar", "Magnetometer", 783, false, "Standby", 51.7, "Trajectory-483");
                SpaceProbeDTO probe484 = new SpaceProbeDTO(484, "Mission-484", "Saturn", "JAXA", 5840.0, LocalDateTime.of(2023, 4, 8, 10, 30), LocalDateTime.of(2025, 4, 8, 9, 15), "Electric", 4420.0, "X-Band", 49400000.0, 58.4, "Magnetometer", "Thermal Sensor", 784, true, "Planned", 51.6, "Trajectory-484");
                SpaceProbeDTO probe485 = new SpaceProbeDTO(485, "Mission-485", "Mercury", "CNSA", 5850.0, LocalDateTime.of(2024, 5, 9, 10, 30), LocalDateTime.of(2026, 5, 9, 9, 15), "Solar Sail", 4425.0, "X-Band", 49500000.0, 58.5, "Thermal Sensor", "Camera", 785, false, "Active", 51.5, "Trajectory-485");
                SpaceProbeDTO probe486 = new SpaceProbeDTO(486, "Mission-486", "Neptune", "SpaceX", 5860.0, LocalDateTime.of(2025, 6, 10, 10, 30), LocalDateTime.of(2027, 6, 10, 9, 15), "Chemical", 4430.0, "X-Band", 49600000.0, 58.6, "Camera", "Spectrometer", 786, true, "Completed", 51.4, "Trajectory-486");
                SpaceProbeDTO probe487 = new SpaceProbeDTO(487, "Mission-487", "Uranus", "Roscosmos", 5870.0, LocalDateTime.of(2026, 7, 11, 10, 30), LocalDateTime.of(2028, 7, 11, 9, 15), "Ion", 4435.0, "X-Band", 49700000.0, 58.7, "Spectrometer", "Radar", 787, false, "Standby", 51.3, "Trajectory-487");
                SpaceProbeDTO probe488 = new SpaceProbeDTO(488, "Mission-488", "Pluto", "BlueOrigin", 5880.0, LocalDateTime.of(2027, 8, 12, 10, 30), LocalDateTime.of(2029, 8, 12, 9, 15), "Nuclear", 4440.0, "X-Band", 49800000.0, 58.8, "Radar", "Magnetometer", 788, true, "Planned", 51.2, "Trajectory-488");
                SpaceProbeDTO probe489 = new SpaceProbeDTO(489, "Mission-489", "Moon", "ULA", 5890.0, LocalDateTime.of(2028, 9, 13, 10, 30), LocalDateTime.of(2030, 9, 13, 9, 15), "Electric", 4445.0, "X-Band", 49900000.0, 58.9, "Magnetometer", "Thermal Sensor", 789, false, "Active", 51.1, "Trajectory-489");
                SpaceProbeDTO probe490 = new SpaceProbeDTO(490, "Mission-490", "Europa", "Boeing", 5900.0, LocalDateTime.of(2029, 10, 14, 10, 30), LocalDateTime.of(2031, 10, 14, 9, 15), "Solar Sail", 4450.0, "X-Band", 50000000.0, 59.0, "Thermal Sensor", "Camera", 790, true, "Completed", 51.0, "Trajectory-490");
                SpaceProbeDTO probe491 = new SpaceProbeDTO(491, "Mission-491", "Mars", "NASA", 5910.0, LocalDateTime.of(2020, 11, 15, 10, 30), LocalDateTime.of(2022, 11, 15, 9, 15), "Chemical", 4455.0, "X-Band", 50100000.0, 59.1, "Camera", "Spectrometer", 791, false, "Standby", 50.9, "Trajectory-491");
                SpaceProbeDTO probe492 = new SpaceProbeDTO(492, "Mission-492", "Venus", "ISRO", 5920.0, LocalDateTime.of(2021, 12, 16, 10, 30), LocalDateTime.of(2023, 12, 16, 9, 15), "Ion", 4460.0, "X-Band", 50200000.0, 59.2, "Spectrometer", "Radar", 792, true, "Planned", 50.8, "Trajectory-492");
                SpaceProbeDTO probe493 = new SpaceProbeDTO(493, "Mission-493", "Jupiter", "ESA", 5930.0, LocalDateTime.of(2022, 1, 17, 10, 30), LocalDateTime.of(2024, 1, 17, 9, 15), "Nuclear", 4465.0, "X-Band", 50300000.0, 59.3, "Radar", "Magnetometer", 793, false, "Active", 50.7, "Trajectory-493");
                SpaceProbeDTO probe494 = new SpaceProbeDTO(494, "Mission-494", "Saturn", "JAXA", 5940.0, LocalDateTime.of(2023, 2, 18, 10, 30), LocalDateTime.of(2025, 2, 18, 9, 15), "Electric", 4470.0, "X-Band", 50400000.0, 59.4, "Magnetometer", "Thermal Sensor", 794, true, "Completed", 50.6, "Trajectory-494");
                SpaceProbeDTO probe495 = new SpaceProbeDTO(495, "Mission-495", "Mercury", "CNSA", 5950.0, LocalDateTime.of(2024, 3, 19, 10, 30), LocalDateTime.of(2026, 3, 19, 9, 15), "Solar Sail", 4475.0, "X-Band", 50500000.0, 59.5, "Thermal Sensor", "Camera", 795, false, "Standby", 50.5, "Trajectory-495");
                SpaceProbeDTO probe496 = new SpaceProbeDTO(496, "Mission-496", "Neptune", "SpaceX", 5960.0, LocalDateTime.of(2025, 4, 20, 10, 30), LocalDateTime.of(2027, 4, 20, 9, 15), "Chemical", 4480.0, "X-Band", 50600000.0, 59.6, "Camera", "Spectrometer", 796, true, "Planned", 50.4, "Trajectory-496");
                SpaceProbeDTO probe497 = new SpaceProbeDTO(497, "Mission-497", "Uranus", "Roscosmos", 5970.0, LocalDateTime.of(2026, 5, 21, 10, 30), LocalDateTime.of(2028, 5, 21, 9, 15), "Ion", 4485.0, "X-Band", 50700000.0, 59.7, "Spectrometer", "Radar", 797, false, "Active", 50.3, "Trajectory-497");
                SpaceProbeDTO probe498 = new SpaceProbeDTO(498, "Mission-498", "Pluto", "BlueOrigin", 5980.0, LocalDateTime.of(2027, 6, 22, 10, 30), LocalDateTime.of(2029, 6, 22, 9, 15), "Nuclear", 4490.0, "X-Band", 50800000.0, 59.8, "Radar", "Magnetometer", 798, true, "Completed", 50.2, "Trajectory-498");
                SpaceProbeDTO probe499 = new SpaceProbeDTO(499, "Mission-499", "Moon", "ULA", 5990.0, LocalDateTime.of(2028, 7, 23, 10, 30), LocalDateTime.of(2030, 7, 23, 9, 15), "Electric", 4495.0, "X-Band", 50900000.0, 59.9, "Magnetometer", "Thermal Sensor", 799, false, "Standby", 50.1, "Trajectory-499");
                SpaceProbeDTO probe500 = new SpaceProbeDTO(500, "Mission-500", "Europa", "Boeing", 6000.0, LocalDateTime.of(2029, 8, 24, 10, 30), LocalDateTime.of(2031, 8, 24, 9, 15), "Solar Sail", 4500.0, "X-Band", 51000000.0, 60.0, "Thermal Sensor", "Camera", 800, true, "Planned", 50.0, "Trajectory-500");

                List<SpaceProbeDTO> probeDTOS = new ArrayList<>();

                probeDTOS.add(probe1);
                probeDTOS.add(probe2);
                probeDTOS.add(probe3);
                probeDTOS.add(probe4);
                probeDTOS.add(probe5);
                probeDTOS.add(probe6);
                probeDTOS.add(probe7);
                probeDTOS.add(probe8);
                probeDTOS.add(probe9);
                probeDTOS.add(probe10);
                probeDTOS.add(probe11);
                probeDTOS.add(probe12);
                probeDTOS.add(probe13);
                probeDTOS.add(probe14);
                probeDTOS.add(probe15);
                probeDTOS.add(probe16);
                probeDTOS.add(probe17);
                probeDTOS.add(probe18);
                probeDTOS.add(probe19);
                probeDTOS.add(probe20);
                probeDTOS.add(probe21);
                probeDTOS.add(probe22);
                probeDTOS.add(probe23);
                probeDTOS.add(probe24);
                probeDTOS.add(probe25);
                probeDTOS.add(probe26);
                probeDTOS.add(probe27);
                probeDTOS.add(probe28);
                probeDTOS.add(probe29);
                probeDTOS.add(probe30);
                probeDTOS.add(probe31);
                probeDTOS.add(probe32);
                probeDTOS.add(probe33);
                probeDTOS.add(probe34);
                probeDTOS.add(probe35);
                probeDTOS.add(probe36);
                probeDTOS.add(probe37);
                probeDTOS.add(probe38);
                probeDTOS.add(probe39);
                probeDTOS.add(probe40);
                probeDTOS.add(probe41);
                probeDTOS.add(probe42);
                probeDTOS.add(probe43);
                probeDTOS.add(probe44);
                probeDTOS.add(probe45);
                probeDTOS.add(probe46);
                probeDTOS.add(probe47);
                probeDTOS.add(probe48);
                probeDTOS.add(probe49);
                probeDTOS.add(probe50);
                probeDTOS.add(probe51);
                probeDTOS.add(probe52);
                probeDTOS.add(probe53);
                probeDTOS.add(probe54);
                probeDTOS.add(probe55);
                probeDTOS.add(probe56);
                probeDTOS.add(probe57);
                probeDTOS.add(probe58);
                probeDTOS.add(probe59);
                probeDTOS.add(probe60);
                probeDTOS.add(probe61);
                probeDTOS.add(probe62);
                probeDTOS.add(probe63);
                probeDTOS.add(probe64);
                probeDTOS.add(probe65);
                probeDTOS.add(probe66);
                probeDTOS.add(probe67);
                probeDTOS.add(probe68);
                probeDTOS.add(probe69);
                probeDTOS.add(probe70);
                probeDTOS.add(probe71);
                probeDTOS.add(probe72);
                probeDTOS.add(probe73);
                probeDTOS.add(probe74);
                probeDTOS.add(probe75);
                probeDTOS.add(probe76);
                probeDTOS.add(probe77);
                probeDTOS.add(probe78);
                probeDTOS.add(probe79);
                probeDTOS.add(probe80);
                probeDTOS.add(probe81);
                probeDTOS.add(probe82);
                probeDTOS.add(probe83);
                probeDTOS.add(probe84);
                probeDTOS.add(probe85);
                probeDTOS.add(probe86);
                probeDTOS.add(probe87);
                probeDTOS.add(probe88);
                probeDTOS.add(probe89);
                probeDTOS.add(probe90);
                probeDTOS.add(probe91);
                probeDTOS.add(probe92);
                probeDTOS.add(probe93);
                probeDTOS.add(probe94);
                probeDTOS.add(probe95);
                probeDTOS.add(probe96);
                probeDTOS.add(probe97);
                probeDTOS.add(probe98);
                probeDTOS.add(probe99);
                probeDTOS.add(probe100);
                probeDTOS.add(probe101);
                probeDTOS.add(probe102);
                probeDTOS.add(probe103);
                probeDTOS.add(probe104);
                probeDTOS.add(probe105);
                probeDTOS.add(probe106);
                probeDTOS.add(probe107);
                probeDTOS.add(probe108);
                probeDTOS.add(probe109);
                probeDTOS.add(probe110);
                probeDTOS.add(probe111);
                probeDTOS.add(probe112);
                probeDTOS.add(probe113);
                probeDTOS.add(probe114);
                probeDTOS.add(probe115);
                probeDTOS.add(probe116);
                probeDTOS.add(probe117);
                probeDTOS.add(probe118);
                probeDTOS.add(probe119);
                probeDTOS.add(probe120);
                probeDTOS.add(probe121);
                probeDTOS.add(probe122);
                probeDTOS.add(probe123);
                probeDTOS.add(probe124);
                probeDTOS.add(probe125);
                probeDTOS.add(probe126);
                probeDTOS.add(probe127);
                probeDTOS.add(probe128);
                probeDTOS.add(probe129);
                probeDTOS.add(probe130);
                probeDTOS.add(probe131);
                probeDTOS.add(probe132);
                probeDTOS.add(probe133);
                probeDTOS.add(probe134);
                probeDTOS.add(probe135);
                probeDTOS.add(probe136);
                probeDTOS.add(probe137);
                probeDTOS.add(probe138);
                probeDTOS.add(probe139);
                probeDTOS.add(probe140);
                probeDTOS.add(probe141);
                probeDTOS.add(probe142);
                probeDTOS.add(probe143);
                probeDTOS.add(probe144);
                probeDTOS.add(probe145);
                probeDTOS.add(probe146);
                probeDTOS.add(probe147);
                probeDTOS.add(probe148);
                probeDTOS.add(probe149);
                probeDTOS.add(probe150);
                probeDTOS.add(probe151);
                probeDTOS.add(probe152);
                probeDTOS.add(probe153);
                probeDTOS.add(probe154);
                probeDTOS.add(probe155);
                probeDTOS.add(probe156);
                probeDTOS.add(probe157);
                probeDTOS.add(probe158);
                probeDTOS.add(probe159);
                probeDTOS.add(probe160);
                probeDTOS.add(probe161);
                probeDTOS.add(probe162);
                probeDTOS.add(probe163);
                probeDTOS.add(probe164);
                probeDTOS.add(probe165);
                probeDTOS.add(probe166);
                probeDTOS.add(probe167);
                probeDTOS.add(probe168);
                probeDTOS.add(probe169);
                probeDTOS.add(probe170);
                probeDTOS.add(probe171);
                probeDTOS.add(probe172);
                probeDTOS.add(probe173);
                probeDTOS.add(probe174);
                probeDTOS.add(probe175);
                probeDTOS.add(probe176);
                probeDTOS.add(probe177);
                probeDTOS.add(probe178);
                probeDTOS.add(probe179);
                probeDTOS.add(probe180);
                probeDTOS.add(probe181);
                probeDTOS.add(probe182);
                probeDTOS.add(probe183);
                probeDTOS.add(probe184);
                probeDTOS.add(probe185);
                probeDTOS.add(probe186);
                probeDTOS.add(probe187);
                probeDTOS.add(probe188);
                probeDTOS.add(probe189);
                probeDTOS.add(probe190);
                probeDTOS.add(probe191);
                probeDTOS.add(probe192);
                probeDTOS.add(probe193);
                probeDTOS.add(probe194);
                probeDTOS.add(probe195);
                probeDTOS.add(probe196);
                probeDTOS.add(probe197);
                probeDTOS.add(probe198);
                probeDTOS.add(probe199);
                probeDTOS.add(probe200);
                probeDTOS.add(probe201);
                probeDTOS.add(probe202);
                probeDTOS.add(probe203);
                probeDTOS.add(probe204);
                probeDTOS.add(probe205);
                probeDTOS.add(probe206);
                probeDTOS.add(probe207);
                probeDTOS.add(probe208);
                probeDTOS.add(probe209);
                probeDTOS.add(probe210);
                probeDTOS.add(probe211);
                probeDTOS.add(probe212);
                probeDTOS.add(probe213);
                probeDTOS.add(probe214);
                probeDTOS.add(probe215);
                probeDTOS.add(probe216);
                probeDTOS.add(probe217);
                probeDTOS.add(probe218);
                probeDTOS.add(probe219);
                probeDTOS.add(probe220);
                probeDTOS.add(probe221);
                probeDTOS.add(probe222);
                probeDTOS.add(probe223);
                probeDTOS.add(probe224);
                probeDTOS.add(probe225);
                probeDTOS.add(probe226);
                probeDTOS.add(probe227);
                probeDTOS.add(probe228);
                probeDTOS.add(probe229);
                probeDTOS.add(probe230);
                probeDTOS.add(probe231);
                probeDTOS.add(probe232);
                probeDTOS.add(probe233);
                probeDTOS.add(probe234);
                probeDTOS.add(probe235);
                probeDTOS.add(probe236);
                probeDTOS.add(probe237);
                probeDTOS.add(probe238);
                probeDTOS.add(probe239);
                probeDTOS.add(probe240);
                probeDTOS.add(probe241);
                probeDTOS.add(probe242);
                probeDTOS.add(probe243);
                probeDTOS.add(probe244);
                probeDTOS.add(probe245);
                probeDTOS.add(probe246);
                probeDTOS.add(probe247);
                probeDTOS.add(probe248);
                probeDTOS.add(probe249);
                probeDTOS.add(probe250);
                probeDTOS.add(probe251);
                probeDTOS.add(probe252);
                probeDTOS.add(probe253);
                probeDTOS.add(probe254);
                probeDTOS.add(probe255);
                probeDTOS.add(probe256);
                probeDTOS.add(probe257);
                probeDTOS.add(probe258);
                probeDTOS.add(probe259);
                probeDTOS.add(probe260);
                probeDTOS.add(probe261);
                probeDTOS.add(probe262);
                probeDTOS.add(probe263);
                probeDTOS.add(probe264);
                probeDTOS.add(probe265);
                probeDTOS.add(probe266);
                probeDTOS.add(probe267);
                probeDTOS.add(probe268);
                probeDTOS.add(probe269);
                probeDTOS.add(probe270);
                probeDTOS.add(probe271);
                probeDTOS.add(probe272);
                probeDTOS.add(probe273);
                probeDTOS.add(probe274);
                probeDTOS.add(probe275);
                probeDTOS.add(probe276);
                probeDTOS.add(probe277);
                probeDTOS.add(probe278);
                probeDTOS.add(probe279);
                probeDTOS.add(probe280);
                probeDTOS.add(probe281);
                probeDTOS.add(probe282);
                probeDTOS.add(probe283);
                probeDTOS.add(probe284);
                probeDTOS.add(probe285);
                probeDTOS.add(probe286);
                probeDTOS.add(probe287);
                probeDTOS.add(probe288);
                probeDTOS.add(probe289);
                probeDTOS.add(probe290);
                probeDTOS.add(probe291);
                probeDTOS.add(probe292);
                probeDTOS.add(probe293);
                probeDTOS.add(probe294);
                probeDTOS.add(probe295);
                probeDTOS.add(probe296);
                probeDTOS.add(probe297);
                probeDTOS.add(probe298);
                probeDTOS.add(probe299);
                probeDTOS.add(probe300);
                probeDTOS.add(probe301);
                probeDTOS.add(probe302);
                probeDTOS.add(probe303);
                probeDTOS.add(probe304);
                probeDTOS.add(probe305);
                probeDTOS.add(probe306);
                probeDTOS.add(probe307);
                probeDTOS.add(probe308);
                probeDTOS.add(probe309);
                probeDTOS.add(probe310);
                probeDTOS.add(probe311);
                probeDTOS.add(probe312);
                probeDTOS.add(probe313);
                probeDTOS.add(probe314);
                probeDTOS.add(probe315);
                probeDTOS.add(probe316);
                probeDTOS.add(probe317);
                probeDTOS.add(probe318);
                probeDTOS.add(probe319);
                probeDTOS.add(probe320);
                probeDTOS.add(probe321);
                probeDTOS.add(probe322);
                probeDTOS.add(probe323);
                probeDTOS.add(probe324);
                probeDTOS.add(probe325);
                probeDTOS.add(probe326);
                probeDTOS.add(probe327);
                probeDTOS.add(probe328);
                probeDTOS.add(probe329);
                probeDTOS.add(probe330);
                probeDTOS.add(probe331);
                probeDTOS.add(probe332);
                probeDTOS.add(probe333);
                probeDTOS.add(probe334);
                probeDTOS.add(probe335);
                probeDTOS.add(probe336);
                probeDTOS.add(probe337);
                probeDTOS.add(probe338);
                probeDTOS.add(probe339);
                probeDTOS.add(probe340);
                probeDTOS.add(probe341);
                probeDTOS.add(probe342);
                probeDTOS.add(probe343);
                probeDTOS.add(probe344);
                probeDTOS.add(probe345);
                probeDTOS.add(probe346);
                probeDTOS.add(probe347);
                probeDTOS.add(probe348);
                probeDTOS.add(probe349);
                probeDTOS.add(probe350);
                probeDTOS.add(probe351);
                probeDTOS.add(probe352);
                probeDTOS.add(probe353);
                probeDTOS.add(probe354);
                probeDTOS.add(probe355);
                probeDTOS.add(probe356);
                probeDTOS.add(probe357);
                probeDTOS.add(probe358);
                probeDTOS.add(probe359);
                probeDTOS.add(probe360);
                probeDTOS.add(probe361);
                probeDTOS.add(probe362);
                probeDTOS.add(probe363);
                probeDTOS.add(probe364);
                probeDTOS.add(probe365);
                probeDTOS.add(probe366);
                probeDTOS.add(probe367);
                probeDTOS.add(probe368);
                probeDTOS.add(probe369);
                probeDTOS.add(probe370);
                probeDTOS.add(probe371);
                probeDTOS.add(probe372);
                probeDTOS.add(probe373);
                probeDTOS.add(probe374);
                probeDTOS.add(probe375);
                probeDTOS.add(probe376);
                probeDTOS.add(probe377);
                probeDTOS.add(probe378);
                probeDTOS.add(probe379);
                probeDTOS.add(probe380);
                probeDTOS.add(probe381);
                probeDTOS.add(probe382);
                probeDTOS.add(probe383);
                probeDTOS.add(probe384);
                probeDTOS.add(probe385);
                probeDTOS.add(probe386);
                probeDTOS.add(probe387);
                probeDTOS.add(probe388);
                probeDTOS.add(probe389);
                probeDTOS.add(probe390);
                probeDTOS.add(probe391);
                probeDTOS.add(probe392);
                probeDTOS.add(probe393);
                probeDTOS.add(probe394);
                probeDTOS.add(probe395);
                probeDTOS.add(probe396);
                probeDTOS.add(probe397);
                probeDTOS.add(probe398);
                probeDTOS.add(probe399);
                probeDTOS.add(probe400);
                probeDTOS.add(probe401);
                probeDTOS.add(probe402);
                probeDTOS.add(probe403);
                probeDTOS.add(probe404);
                probeDTOS.add(probe405);
                probeDTOS.add(probe406);
                probeDTOS.add(probe407);
                probeDTOS.add(probe408);
                probeDTOS.add(probe409);
                probeDTOS.add(probe410);
                probeDTOS.add(probe411);
                probeDTOS.add(probe412);
                probeDTOS.add(probe413);
                probeDTOS.add(probe414);
                probeDTOS.add(probe415);
                probeDTOS.add(probe416);
                probeDTOS.add(probe417);
                probeDTOS.add(probe418);
                probeDTOS.add(probe419);
                probeDTOS.add(probe420);
                probeDTOS.add(probe421);
                probeDTOS.add(probe422);
                probeDTOS.add(probe423);
                probeDTOS.add(probe424);
                probeDTOS.add(probe425);
                probeDTOS.add(probe426);
                probeDTOS.add(probe427);
                probeDTOS.add(probe428);
                probeDTOS.add(probe429);
                probeDTOS.add(probe430);
                probeDTOS.add(probe431);
                probeDTOS.add(probe432);
                probeDTOS.add(probe433);
                probeDTOS.add(probe434);
                probeDTOS.add(probe435);
                probeDTOS.add(probe436);
                probeDTOS.add(probe437);
                probeDTOS.add(probe438);
                probeDTOS.add(probe439);
                probeDTOS.add(probe440);
                probeDTOS.add(probe441);
                probeDTOS.add(probe442);
                probeDTOS.add(probe443);
                probeDTOS.add(probe444);
                probeDTOS.add(probe445);
                probeDTOS.add(probe446);
                probeDTOS.add(probe447);
                probeDTOS.add(probe448);
                probeDTOS.add(probe449);
                probeDTOS.add(probe450);
                probeDTOS.add(probe451);
                probeDTOS.add(probe452);
                probeDTOS.add(probe453);
                probeDTOS.add(probe454);
                probeDTOS.add(probe455);
                probeDTOS.add(probe456);
                probeDTOS.add(probe457);
                probeDTOS.add(probe458);
                probeDTOS.add(probe459);
                probeDTOS.add(probe460);
                probeDTOS.add(probe461);
                probeDTOS.add(probe462);
                probeDTOS.add(probe463);
                probeDTOS.add(probe464);
                probeDTOS.add(probe465);
                probeDTOS.add(probe466);
                probeDTOS.add(probe467);
                probeDTOS.add(probe468);
                probeDTOS.add(probe469);
                probeDTOS.add(probe470);
                probeDTOS.add(probe471);
                probeDTOS.add(probe472);
                probeDTOS.add(probe473);
                probeDTOS.add(probe474);
                probeDTOS.add(probe475);
                probeDTOS.add(probe476);
                probeDTOS.add(probe477);
                probeDTOS.add(probe478);
                probeDTOS.add(probe479);
                probeDTOS.add(probe480);
                probeDTOS.add(probe481);
                probeDTOS.add(probe482);
                probeDTOS.add(probe483);
                probeDTOS.add(probe484);
                probeDTOS.add(probe485);
                probeDTOS.add(probe486);
                probeDTOS.add(probe487);
                probeDTOS.add(probe488);
                probeDTOS.add(probe489);
                probeDTOS.add(probe490);
                probeDTOS.add(probe491);
                probeDTOS.add(probe492);
                probeDTOS.add(probe493);
                probeDTOS.add(probe494);
                probeDTOS.add(probe495);
                probeDTOS.add(probe496);
                probeDTOS.add(probe497);
                probeDTOS.add(probe498);
                probeDTOS.add(probe499);
                probeDTOS.add(probe500);

                System.out.println("Total Probes: " + probeDTOS.size());
                int count = 0;
                int count1 = 0;
                int count2 = 0;
                int count3 = 0;
                int count4 = 0;
                int count5 = 0;
                int count6 = 0;
                int count7 = 0;
                int count8 = 0;
                int count9 = 0;
                int count10 = 0;
                int count11 = 0;
                int count12 = 0;
                int count13 = 0;
                int count14 = 0;
                int count15 = 0;
                int count16 = 0;
                int count17 = 0;
                int count18 = 0;
                int count19 = 0;
                int count20 = 0;
                int serialNoData = 1;
                int serialNoQuction=1;


                Iterator<SpaceProbeDTO> iterator = probeDTOS.iterator();
                while (iterator.hasNext()) {

                    SpaceProbeDTO element = iterator.next();


                    if (element.getStatus().equals("Completed")) {
                        System.out.println(serialNoData+":"+element);
                        serialNoData++;
                        count++;

                    }


                    if (element.getPropulsionType().equals("Electric")) {

                        count1++;

                    }

                }
                System.out.println(serialNoQuction++ + " :" + "Success status is: " + count);
                System.out.println(serialNoQuction++ + " :" + "PropulsionType  Electric is : " + count1);
                System.out.println("=========================================================");

                iterator=probeDTOS.iterator();
                while (iterator.hasNext()) {

                    SpaceProbeDTO element = iterator.next();

                    if (element.isActive()) {
                        System.out.println(element);
                        count2++;


                    }
                    if (element.getTargetCelestialBody().equals("Pluto")) {

                        count3++;

                    }

                }
                System.out.println(serialNoQuction++ + " :" + " currently active working: " + count2);
                System.out.println(serialNoQuction++ + " :" + " targeting  : " + count3);
                System.out.println("======================================================================");

                iterator=probeDTOS.iterator();
                while (iterator.hasNext()) {

                    SpaceProbeDTO element = iterator.next();

                    if (element.getFuelRemaining()<75.00) {
                        System.out.println( element);
                        count4++;
                    }
                    if (element.getManufacturer().equals("NASA")) {

                        count5++;
                    }
                }
                System.out.println(serialNoQuction++ + " :" + " fuelRemaining less than 75 is: " + count4);
                System.out.println(serialNoQuction++ + " :" + "how many  manufactured by NASA : " + count5);

                System.out.println("====================================================================================");

                iterator=probeDTOS.iterator();
                while (iterator.hasNext()) {

                    SpaceProbeDTO element = iterator.next();

                    if (element.getMissionDurationDays()>365) {
                        System.out.println( element);
                        count6++;
                    }
                    if (element.getPowerOutput()>1000.00) {

                        count7++;
                    }
                }
                System.out.println(serialNoQuction++ + " :" + "missionDurationDays greater than 365 is: " + count6);
                System.out.println(serialNoQuction++ + " :" + "how many  manufactured by NASA : " + count7);

                iterator=probeDTOS.iterator();
                while (iterator.hasNext()) {

                    SpaceProbeDTO element = iterator.next();

                    if (element.getDistanceFromEarth()>1000000) {
                        System.out.println( element);
                        count9++;
                    }
                    if (element.getPrimaryInstrument().equals("Camera")) {

                        count10++;
                    }
                }
                System.out.println(serialNoQuction++ + " :" + "within 1 million km of Earth: " + count9);
                System.out.println(serialNoQuction++ + " :" + "only primaryInstrument Camera: " + count10);

                iterator=probeDTOS.iterator();
                while (iterator.hasNext()) {

                    SpaceProbeDTO element = iterator.next();

                    if (element.getStatus().equals("Standby")) {
                        System.out.println(element);
                        count11++;
                    }
                    if (element.getLaunchDate().getYear()>2022) {

                        count12++;
                    }
                }
                System.out.println(serialNoQuction++ + ":" + "have status Failed: " + count11);
                System.out.println(serialNoQuction++ + ":" + "lonching date: " + count12);

                iterator=probeDTOS.iterator();
                while (iterator.hasNext()) {

                    SpaceProbeDTO element = iterator.next();

                    if (element.getCommunicationFrequency().equals("X-Band")) {
                        System.out.println(element);
                        count13++;
                    }
                    if (element.getLaunchMass()>1000.0) {

                        count14++;
                    }
                }
                System.out.println(serialNoQuction++ + ":" + "have Communication Frequency: " + count13);
                System.out.println(serialNoQuction++ + ":" + "lonching mass: " + count14);







































            iterator=probeDTOS.iterator();
            while(iterator.hasNext()){
                SpaceProbeDTO element=iterator.next();

                if(element.getArrivalDate().getYear()>2024){
                    iterator.remove();
                    System.out.println(element);
                    count15++;

                }
            }
                System.out.println(count15);


                Collections.sort(probeDTOS);




            }

}


