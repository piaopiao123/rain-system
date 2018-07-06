DROP TABLE IF EXISTS RainQuality;

CREATE TABLE RainQuality
(id INT(10) PRIMARY KEY AUTO_INCREMENT
,districtname VARCHAR(22) NOT NULL
,monitortime DATETIME NOT NULL
,rain INT (10) NOT NULL
,monitoringstation VARCHAR(200) NOT NULL
,monitoringaddress VARCHAR(200) NOT NULL
);

INSERT INTO RainQuality(districtname, monitortime, rain, monitoringstation, monitoringaddress)
    VALUES ('丰台区','2014-08-11',5,'七里庄站','七里庄站');
INSERT INTO RainQuality(districtname, monitortime, rain, monitoringstation, monitoringaddress)
    VALUES ('西城区','2014-07-08',4,'二龙路站','金融界二龙路');
INSERT INTO RainQuality(districtname, monitortime, rain, monitoringstation, monitoringaddress)
    VALUES ('东城区','2014-06-29',3,'东四站','东四街道');
INSERT INTO RainQuality(districtname, monitortime, rain, monitoringstation, monitoringaddress)
    VALUES ('海淀区','2014-06-26',6,'西二旗站','上地三战');