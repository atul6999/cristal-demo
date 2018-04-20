set foreign_key_checks = 1;

CREATE TABLE `skill` (
  `skill_id` int(11) NOT NULL AUTO_INCREMENT,
  `skill_name` varchar(255) DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`skill_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `administration_rights` int(11) DEFAULT NULL,
  `company` varchar(255) DEFAULT NULL,
  `confirmation_token` varchar(255) DEFAULT NULL,
  `coverage_concurrent_active` tinyint(4) DEFAULT NULL,
  `credentials_expire_at` datetime DEFAULT NULL,
  `credentials_expired` tinyint(4) NOT NULL,
  `email` varchar(255) DEFAULT NULL,
  `email2` varchar(255) DEFAULT NULL,
  `email_canonical` varchar(255) DEFAULT NULL,
  `enabled` tinyint(4) NOT NULL,
  `expired` tinyint(4) NOT NULL,
  `expires_at` datetime DEFAULT NULL,
  `firstname` varchar(64) DEFAULT NULL,
  `habilitation_date` datetime DEFAULT NULL,
  `heartbeat_active` tinyint(4) DEFAULT NULL,
  `last_login` datetime DEFAULT NULL,
  `lastname` varchar(64) DEFAULT NULL,
  `locked` tinyint(4) NOT NULL,
  `mail2_notification_active` tinyint(4) DEFAULT NULL,
  `mail_notification_active` tinyint(4) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `password` varchar(255) NOT NULL,
  `password_requested_at` datetime DEFAULT NULL,
  `phone` varchar(64) DEFAULT NULL,
  `phone2` varchar(64) DEFAULT NULL,
  `remedy_active` tinyint(4) DEFAULT NULL,
  `roles` longtext NOT NULL,
  `salt` varchar(255) NOT NULL,
  `sms2_notification_active` tinyint(4) DEFAULT NULL,
  `sms_notification_active` tinyint(4) DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  `tdf` tinyint(4) NOT NULL,
  `telephone_notification_active` tinyint(4) DEFAULT NULL,
  `username` varchar(255) NOT NULL,
  `username_canonical` varchar(255) NOT NULL,
  `active_user_profile_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `application` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `description` varchar(255) DEFAULT NULL,
  `logo` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `url` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `severity_type` (
  `id` int(11) NOT NULL,
  `name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `level` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `color` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `creation_date` datetime(3) DEFAULT NULL,
  `modification_date` datetime(3) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

CREATE TABLE `configuration` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  `value` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `customer` (
  `identifier` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `external_name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `internal_name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `creation_date` datetime(3) DEFAULT NULL,
  `modification_date` datetime(3) DEFAULT NULL,
  `active` tinyint(1) NOT NULL,
  PRIMARY KEY (`identifier`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;


CREATE TABLE `geo_site` (
  `code` varchar(64) COLLATE utf8_unicode_ci NOT NULL,
  `town_insee_code` varchar(64) COLLATE utf8_unicode_ci DEFAULT NULL,
  `tdf_division_code` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `name` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `internal_name` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `external_name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `altitude` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `latitude` double NOT NULL,
  `longitude` double NOT NULL,
  `csa_code` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `csa_name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `locality` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `address` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `tdf` tinyint(1) DEFAULT NULL,
  `town_name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `zip_code` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `creation_date` datetime(3) DEFAULT NULL,
  `modification_date` datetime(3) DEFAULT NULL,
  `station_name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `active` tinyint(1) NOT NULL,
  PRIMARY KEY (`code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

CREATE TABLE `permission` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `description` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `device` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UNIQ_92FB68E5E237E06` (`name`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;


CREATE TABLE `grid` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `label` varchar(255) DEFAULT NULL,
  `name` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `grid_field` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `api_field` varchar(255) DEFAULT NULL,
  `api_object` varchar(255) DEFAULT NULL,
  `field_type` varchar(255) NOT NULL,
  `label` varchar(255) NOT NULL,
  `name` varchar(255) NOT NULL,
  `grid_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FKaatxpudpu3fxsn26a0xai4ylv` (`grid_id`),
  CONSTRAINT `FKaatxpudpu3fxsn26a0xai4ylv` FOREIGN KEY (`grid_id`) REFERENCES `grid` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `profile` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `duration` int(11) NOT NULL,
  `is_primary` tinyint(4) NOT NULL,
  `label` tinyint(4) NOT NULL,
  `logo` varchar(255) DEFAULT NULL,
  `name` varchar(255) NOT NULL,
  `tdf_contact_email` varchar(255) DEFAULT NULL,
  `tdf_contact_phone` varchar(255) DEFAULT NULL,
  `type` tinyint(4) NOT NULL,
  `application_id` int(11) NOT NULL,
  `user_manual_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK9qa9vl67fw20pul9le5qmcead` (`application_id`),
  CONSTRAINT `FK9qa9vl67fw20pul9le5qmcead` FOREIGN KEY (`application_id`) REFERENCES `application` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `grid_field_profile` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `column_order` smallint(6) DEFAULT NULL,
  `grid_field_id` int(11) NOT NULL,
  `profile_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FK5l43jjr2352s36806pfgltdav` (`grid_field_id`),
  KEY `FK1nmtxrlqsup8nf6ey2jhvf2x1` (`profile_id`),
  CONSTRAINT `FK1nmtxrlqsup8nf6ey2jhvf2x1` FOREIGN KEY (`profile_id`) REFERENCES `profile` (`id`),
  CONSTRAINT `FK5l43jjr2352s36806pfgltdav` FOREIGN KEY (`grid_field_id`) REFERENCES `grid_field` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `service` (
  `identifier` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `customer_identifier` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `creation_date` datetime(3) DEFAULT NULL,
  `modification_date` datetime(3) DEFAULT NULL,
  `external_name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `internal_name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `active` tinyint(1) NOT NULL,
  `service_group_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`identifier`),
  KEY `IDX_E19D9AD28AE787E8` (`customer_identifier`),
  CONSTRAINT `FK_E19D9AD28AE787E8` FOREIGN KEY (`customer_identifier`) REFERENCES `customer` (`identifier`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

CREATE TABLE `event_type` (
  `identifier` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `severity_type_id` int(11) NOT NULL,
  `name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `internal_name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `external_name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `internal_desc` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `external_desc` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `creation_date` datetime(3) DEFAULT NULL,
  `modification_date` datetime(3) DEFAULT NULL,
  `active` tinyint(1) NOT NULL,
  `animation` int(11) DEFAULT NULL,
  `is_filtered` int(11) NOT NULL DEFAULT '1',
  `displayInfoToClient` int(11) NOT NULL,
  `display_info_to_client` int(11) NOT NULL,
  PRIMARY KEY (`identifier`),
  KEY `IDX_93151B82FEB17355` (`severity_type_id`),
  CONSTRAINT `FK_93151B82FEB17355` FOREIGN KEY (`severity_type_id`) REFERENCES `severity_type` (`id`),
  CONSTRAINT `FKrlinp46ymrv7ovso9tmq869j0` FOREIGN KEY (`severity_type_id`) REFERENCES `severity_type` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

CREATE TABLE `user_profile` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `profile_id` int(11) NOT NULL,
  `user_id` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `user_profile_device` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `parameters` varchar(4000) DEFAULT NULL,
  `device_id` int(11) DEFAULT NULL,
  `user_profile_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `grid_field_user_profile_device` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `column_order` smallint(6) NOT NULL,
  `filter` longtext,
  `grid_field_id` int(11) NOT NULL,
  `user_profile_device_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FKa1kjntxqx05lhj1id9nhl35hs` (`grid_field_id`),
  KEY `FKcj0sik5d2fhfovounr0s2sb4a` (`user_profile_device_id`),
  CONSTRAINT `FKa1kjntxqx05lhj1id9nhl35hs` FOREIGN KEY (`grid_field_id`) REFERENCES `grid_field` (`id`),
  CONSTRAINT `FKcj0sik5d2fhfovounr0s2sb4a` FOREIGN KEY (`user_profile_device_id`) REFERENCES `user_profile_device` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `user_permission` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `permission_id` int(11) NOT NULL,
  `user_id` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `user_profile_permission` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `permission_id` int(11) NOT NULL,
  `user_profile_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FKqusbtn7jtyusrosu9xa7f973e` (`permission_id`),
  CONSTRAINT `FKqusbtn7jtyusrosu9xa7f973e` FOREIGN KEY (`permission_id`) REFERENCES `permission` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `profile_permission` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `permission_id` int(11) NOT NULL,
  `profile_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FKl1xh3stwjjbnigw6ue5is47rp` (`permission_id`),
  KEY `FK7qev3lmmypk5h2xvymymt4x33` (`profile_id`),
  CONSTRAINT `FK7qev3lmmypk5h2xvymymt4x33` FOREIGN KEY (`profile_id`) REFERENCES `profile` (`id`),
  CONSTRAINT `FKl1xh3stwjjbnigw6ue5is47rp` FOREIGN KEY (`permission_id`) REFERENCES `permission` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `profile_event_type` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `animate_links` int(11) NOT NULL,
  `delay` int(11) NOT NULL,
  `label` varchar(255) DEFAULT NULL,
  `mail_notification_active` tinyint(4) DEFAULT NULL,
  `sms_notification_active` tinyint(4) DEFAULT NULL,
  `event_type_identifier` varchar(255) NOT NULL,
  `profile_id` int(11) NOT NULL,
  `severity_type_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKjwpir8cn884gfr24f3i025aie` (`profile_id`),
  KEY `FKq7398ll6l293u9o3nyq6o6613` (`severity_type_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `service_point` (
  `identifier` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `service_identifier` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `geo_site_code` varchar(64) COLLATE utf8_unicode_ci NOT NULL,
  `service_point_type_id` int(11) NOT NULL,
  `id_esther` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `status` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `provider` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `emission_polarization` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `reception_polarization` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `emission_channel` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `reception_channel` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `emission_frequency` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `reception_frequency` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `power` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `offset` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `population` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `sfn` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `csa_authorisation_name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `tdf` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `creation_date` datetime(3) DEFAULT NULL,
  `modification_date` datetime(3) DEFAULT NULL,
  `mux_name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `measure_action_available` tinyint(1) DEFAULT NULL,
  `contract_type_name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `source_identifier` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `nature` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `channel_code` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `channel_name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `commisionned_date` datetime(3) DEFAULT NULL,
  `cell_id` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `group_contract` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `antenna_type` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `backup_emitter_name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `main_power` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `antenna_height` int(11) DEFAULT NULL,
  `emitter_type` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `backup_energy` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `monitoring` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `gui_name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `cristal_id` int(11) DEFAULT NULL,
  `sla_name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `external_name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `internal_name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `monitoring_equipment_id` int(11) DEFAULT NULL,
  `gprs` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `active` tinyint(1) NOT NULL,
  `streaming` tinyint(1) DEFAULT NULL,
  `telemetry_available` tinyint(1) DEFAULT NULL,
  `service_point_status_id` int(11) DEFAULT NULL,
  `service_point_contract_type_id` int(11) DEFAULT NULL,
  `service_point_sla_id` int(11) DEFAULT NULL,
  `service_point_provider_id` int(11) DEFAULT NULL,
  `coverage_available` tinyint(1) NOT NULL,
  `coverage_file` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `synoptic_id` int(11) DEFAULT NULL,
  `coverage_active` tinyint(1) DEFAULT '0',
  `category` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `wolf_identifier` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `service_external_name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `main_power_customer` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `plaque_sfn` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `gamme_vendue` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `categorie_cristal` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `serv_id_helios` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `par_max_site` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `par_max_csa_site` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`identifier`),
  UNIQUE KEY `UNIQ_1ED71EC3476420D` (`coverage_file`),
  KEY `IDX_1ED71EC3E17FBADE` (`service_identifier`),
  KEY `IDX_1ED71EC3EDB0A768` (`geo_site_code`),
  CONSTRAINT `FK_1ED71EC3E17FBADE` FOREIGN KEY (`service_identifier`) REFERENCES `service` (`identifier`),
  CONSTRAINT `FK_1ED71EC3EDB0A768` FOREIGN KEY (`geo_site_code`) REFERENCES `geo_site` (`code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

CREATE TABLE `profile_service_point` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `service_point_identifier` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `profile_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UNQ_profileId_servicePointIdentifier` (`service_point_identifier`,`profile_id`),
  KEY `IDX_30D4BB03C1E87D1` (`service_point_identifier`),
  KEY `IDX_30D4BB03CCFA12B8` (`profile_id`),
  CONSTRAINT `FK_30D4BB03C1E87D1` FOREIGN KEY (`service_point_identifier`) REFERENCES `service_point` (`identifier`) ON DELETE CASCADE,
  CONSTRAINT `FK_30D4BB03CCFA12B8` FOREIGN KEY (`profile_id`) REFERENCES `profile` (`id`) ON DELETE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=1048576 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

CREATE TABLE `user_skills` (
  `id` int(11) NOT NULL,
  `user_id` int(11) NOT NULL,
  `skill_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
