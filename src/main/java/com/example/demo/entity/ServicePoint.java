package com.example.demo.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the service_point database table.
 * 
 */
@Entity
@Table(name="service_point")
@NamedQuery(name="ServicePoint.findAll", query="SELECT s FROM ServicePoint s")
public class ServicePoint implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false, length=255)
	private String identifier;

	@Column(nullable=false)
	private byte active;

	@Column(name="antenna_height")
	private int antennaHeight;

	@Column(name="antenna_type", length=255)
	private String antennaType;

	@Column(name="backup_emitter_name", length=255)
	private String backupEmitterName;

	@Column(name="backup_energy", length=255)
	private String backupEnergy;

	@Column(name="categorie_cristal", length=255)
	private String categorieCristal;

	@Column(length=255)
	private String category;

	@Column(name="cell_id", length=255)
	private String cellId;

	@Column(name="channel_code", length=255)
	private String channelCode;

	@Column(name="channel_name", length=255)
	private String channelName;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="commisionned_date")
	private Date commisionnedDate;

	@Column(name="contract_type_name", length=255)
	private String contractTypeName;

	@Column(name="coverage_active")
	private byte coverageActive;

	@Column(name="coverage_available", nullable=false)
	private byte coverageAvailable;

	@Column(name="coverage_file", length=255)
	private String coverageFile;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="creation_date")
	private Date creationDate;

	@Column(name="cristal_id")
	private int cristalId;

	@Column(name="csa_authorisation_name", length=255)
	private String csaAuthorisationName;

	@Column(name="emission_channel", length=255)
	private String emissionChannel;

	@Column(name="emission_frequency", length=255)
	private String emissionFrequency;

	@Column(name="emission_polarization", length=255)
	private String emissionPolarization;

	@Column(name="emitter_type", length=255)
	private String emitterType;

	@Column(name="external_name", length=255)
	private String externalName;

	@Column(name="gamme_vendue", length=255)
	private String gammeVendue;

	@Column(length=255)
	private String gprs;

	@Column(name="group_contract", length=255)
	private String groupContract;

	@Column(name="gui_name", length=255)
	private String guiName;

	@Column(name="id_esther", length=255)
	private String idEsther;

	@Column(name="internal_name", length=255)
	private String internalName;

	@Column(name="main_power", length=255)
	private String mainPower;

	@Column(name="main_power_customer", length=255)
	private String mainPowerCustomer;

	@Column(name="measure_action_available")
	private byte measureActionAvailable;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="modification_date")
	private Date modificationDate;

	@Column(length=255)
	private String monitoring;

	@Column(name="mux_name", length=255)
	private String muxName;

	@Column(length=255)
	private String name;

	@Column(length=255)
	private String nature;

	@Column(length=255)
	private String offset;

	@Column(name="par_max_csa_site", length=255)
	private String parMaxCsaSite;

	@Column(name="par_max_site", length=255)
	private String parMaxSite;

	@Column(name="plaque_sfn", length=255)
	private String plaqueSfn;

	@Column(length=255)
	private String population;

	@Column(length=255)
	private String power;

	@Column(length=255)
	private String provider;

	@Column(name="reception_channel", length=255)
	private String receptionChannel;

	@Column(name="reception_frequency", length=255)
	private String receptionFrequency;

	@Column(name="reception_polarization", length=255)
	private String receptionPolarization;

	@Column(name="serv_id_helios", length=255)
	private String servIdHelios;

	@Column(name="service_external_name", length=255)
	private String serviceExternalName;

	@Column(length=255)
	private String sfn;

	@Column(name="sla_name", length=255)
	private String slaName;

	@Column(name="source_identifier", length=255)
	private String sourceIdentifier;

	@Column(length=255)
	private String status;

	private byte streaming;

	@Column(length=255)
	private String tdf;

	@Column(name="telemetry_available")
	private byte telemetryAvailable;

	@Column(name="wolf_identifier", length=255)
	private String wolfIdentifier;

	//bi-directional many-to-one association to F3RegionServicePoint
	@OneToMany(mappedBy="servicePoint")
	private List<F3RegionServicePoint> f3RegionServicePoints;

	//bi-directional many-to-one association to MenuServicePoint
	@OneToMany(mappedBy="servicePoint")
	private List<MenuServicePoint> menuServicePoints;

	//bi-directional many-to-one association to NetworkLinkServicePointEventType
	@OneToMany(mappedBy="servicePoint")
	private List<NetworkLinkServicePointEventType> networkLinkServicePointEventTypes;

	//bi-directional many-to-one association to ProfileHistoryStreaming
	@OneToMany(mappedBy="servicePoint")
	private List<ProfileHistoryStreaming> profileHistoryStreamings;

	//bi-directional many-to-one association to ProfileLiveStreaming
	@OneToMany(mappedBy="servicePoint")
	private List<ProfileLiveStreaming> profileLiveStreamings;

	//bi-directional many-to-one association to ProfileServicePoint
	@OneToMany(mappedBy="servicePoint")
	private List<ProfileServicePoint> profileServicePoints;

	//bi-directional many-to-one association to ProfileServicePointEventType
	@OneToMany(mappedBy="servicePoint")
	private List<ProfileServicePointEventType> profileServicePointEventTypes;

	//bi-directional many-to-one association to Resource
	@OneToMany(mappedBy="servicePoint")
	private List<Resource> resources;

	//bi-directional many-to-one association to ResourceServicePoint
	@OneToMany(mappedBy="servicePoint")
	private List<ResourceServicePoint> resourceServicePoints;

	//bi-directional many-to-one association to ServicePointProvider
	@ManyToOne
	@JoinColumn(name="service_point_provider_id")
	private ServicePointProvider servicePointProvider;

	//bi-directional many-to-one association to MonitoringEquipment
	@ManyToOne
	@JoinColumn(name="monitoring_equipment_id")
	private MonitoringEquipment monitoringEquipment;

	//bi-directional many-to-one association to ServicePointType
	@ManyToOne
	@JoinColumn(name="service_point_type_id", nullable=false)
	private ServicePointType servicePointType;

	//bi-directional many-to-one association to Synoptic
	@ManyToOne
	@JoinColumn(name="synoptic_id")
	private Synoptic synoptic;

	//bi-directional many-to-one association to ServicePointSla
	@ManyToOne
	@JoinColumn(name="service_point_sla_id")
	private ServicePointSla servicePointSla;

	//bi-directional many-to-one association to ServicePointContractType
	@ManyToOne
	@JoinColumn(name="service_point_contract_type_id")
	private ServicePointContractType servicePointContractType;

	//bi-directional many-to-one association to Service
	@ManyToOne
	@JoinColumn(name="service_identifier", nullable=false)
	private Service service;

	//bi-directional many-to-one association to ServicePointStatus
	@ManyToOne
	@JoinColumn(name="service_point_status_id")
	private ServicePointStatus servicePointStatus;

	//bi-directional many-to-one association to GeoSite
	@ManyToOne
	@JoinColumn(name="geo_site_code", nullable=false)
	private GeoSite geoSite;

	//bi-directional many-to-one association to SynopticComponent
	@OneToMany(mappedBy="servicePoint")
	private List<SynopticComponent> synopticComponents;

	//bi-directional many-to-one association to Telemetry
	@OneToMany(mappedBy="servicePoint")
	private List<Telemetry> telemetries;

	//bi-directional many-to-one association to TransportServicePoint
	@OneToMany(mappedBy="servicePoint")
	private List<TransportServicePoint> transportServicePoints;

	public ServicePoint() {
	}

	public String getIdentifier() {
		return this.identifier;
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}

	public byte getActive() {
		return this.active;
	}

	public void setActive(byte active) {
		this.active = active;
	}

	public int getAntennaHeight() {
		return this.antennaHeight;
	}

	public void setAntennaHeight(int antennaHeight) {
		this.antennaHeight = antennaHeight;
	}

	public String getAntennaType() {
		return this.antennaType;
	}

	public void setAntennaType(String antennaType) {
		this.antennaType = antennaType;
	}

	public String getBackupEmitterName() {
		return this.backupEmitterName;
	}

	public void setBackupEmitterName(String backupEmitterName) {
		this.backupEmitterName = backupEmitterName;
	}

	public String getBackupEnergy() {
		return this.backupEnergy;
	}

	public void setBackupEnergy(String backupEnergy) {
		this.backupEnergy = backupEnergy;
	}

	public String getCategorieCristal() {
		return this.categorieCristal;
	}

	public void setCategorieCristal(String categorieCristal) {
		this.categorieCristal = categorieCristal;
	}

	public String getCategory() {
		return this.category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getCellId() {
		return this.cellId;
	}

	public void setCellId(String cellId) {
		this.cellId = cellId;
	}

	public String getChannelCode() {
		return this.channelCode;
	}

	public void setChannelCode(String channelCode) {
		this.channelCode = channelCode;
	}

	public String getChannelName() {
		return this.channelName;
	}

	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}

	public Date getCommisionnedDate() {
		return this.commisionnedDate;
	}

	public void setCommisionnedDate(Date commisionnedDate) {
		this.commisionnedDate = commisionnedDate;
	}

	public String getContractTypeName() {
		return this.contractTypeName;
	}

	public void setContractTypeName(String contractTypeName) {
		this.contractTypeName = contractTypeName;
	}

	public byte getCoverageActive() {
		return this.coverageActive;
	}

	public void setCoverageActive(byte coverageActive) {
		this.coverageActive = coverageActive;
	}

	public byte getCoverageAvailable() {
		return this.coverageAvailable;
	}

	public void setCoverageAvailable(byte coverageAvailable) {
		this.coverageAvailable = coverageAvailable;
	}

	public String getCoverageFile() {
		return this.coverageFile;
	}

	public void setCoverageFile(String coverageFile) {
		this.coverageFile = coverageFile;
	}

	public Date getCreationDate() {
		return this.creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public int getCristalId() {
		return this.cristalId;
	}

	public void setCristalId(int cristalId) {
		this.cristalId = cristalId;
	}

	public String getCsaAuthorisationName() {
		return this.csaAuthorisationName;
	}

	public void setCsaAuthorisationName(String csaAuthorisationName) {
		this.csaAuthorisationName = csaAuthorisationName;
	}

	public String getEmissionChannel() {
		return this.emissionChannel;
	}

	public void setEmissionChannel(String emissionChannel) {
		this.emissionChannel = emissionChannel;
	}

	public String getEmissionFrequency() {
		return this.emissionFrequency;
	}

	public void setEmissionFrequency(String emissionFrequency) {
		this.emissionFrequency = emissionFrequency;
	}

	public String getEmissionPolarization() {
		return this.emissionPolarization;
	}

	public void setEmissionPolarization(String emissionPolarization) {
		this.emissionPolarization = emissionPolarization;
	}

	public String getEmitterType() {
		return this.emitterType;
	}

	public void setEmitterType(String emitterType) {
		this.emitterType = emitterType;
	}

	public String getExternalName() {
		return this.externalName;
	}

	public void setExternalName(String externalName) {
		this.externalName = externalName;
	}

	public String getGammeVendue() {
		return this.gammeVendue;
	}

	public void setGammeVendue(String gammeVendue) {
		this.gammeVendue = gammeVendue;
	}

	public String getGprs() {
		return this.gprs;
	}

	public void setGprs(String gprs) {
		this.gprs = gprs;
	}

	public String getGroupContract() {
		return this.groupContract;
	}

	public void setGroupContract(String groupContract) {
		this.groupContract = groupContract;
	}

	public String getGuiName() {
		return this.guiName;
	}

	public void setGuiName(String guiName) {
		this.guiName = guiName;
	}

	public String getIdEsther() {
		return this.idEsther;
	}

	public void setIdEsther(String idEsther) {
		this.idEsther = idEsther;
	}

	public String getInternalName() {
		return this.internalName;
	}

	public void setInternalName(String internalName) {
		this.internalName = internalName;
	}

	public String getMainPower() {
		return this.mainPower;
	}

	public void setMainPower(String mainPower) {
		this.mainPower = mainPower;
	}

	public String getMainPowerCustomer() {
		return this.mainPowerCustomer;
	}

	public void setMainPowerCustomer(String mainPowerCustomer) {
		this.mainPowerCustomer = mainPowerCustomer;
	}

	public byte getMeasureActionAvailable() {
		return this.measureActionAvailable;
	}

	public void setMeasureActionAvailable(byte measureActionAvailable) {
		this.measureActionAvailable = measureActionAvailable;
	}

	public Date getModificationDate() {
		return this.modificationDate;
	}

	public void setModificationDate(Date modificationDate) {
		this.modificationDate = modificationDate;
	}

	public String getMonitoring() {
		return this.monitoring;
	}

	public void setMonitoring(String monitoring) {
		this.monitoring = monitoring;
	}

	public String getMuxName() {
		return this.muxName;
	}

	public void setMuxName(String muxName) {
		this.muxName = muxName;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNature() {
		return this.nature;
	}

	public void setNature(String nature) {
		this.nature = nature;
	}

	public String getOffset() {
		return this.offset;
	}

	public void setOffset(String offset) {
		this.offset = offset;
	}

	public String getParMaxCsaSite() {
		return this.parMaxCsaSite;
	}

	public void setParMaxCsaSite(String parMaxCsaSite) {
		this.parMaxCsaSite = parMaxCsaSite;
	}

	public String getParMaxSite() {
		return this.parMaxSite;
	}

	public void setParMaxSite(String parMaxSite) {
		this.parMaxSite = parMaxSite;
	}

	public String getPlaqueSfn() {
		return this.plaqueSfn;
	}

	public void setPlaqueSfn(String plaqueSfn) {
		this.plaqueSfn = plaqueSfn;
	}

	public String getPopulation() {
		return this.population;
	}

	public void setPopulation(String population) {
		this.population = population;
	}

	public String getPower() {
		return this.power;
	}

	public void setPower(String power) {
		this.power = power;
	}

	public String getProvider() {
		return this.provider;
	}

	public void setProvider(String provider) {
		this.provider = provider;
	}

	public String getReceptionChannel() {
		return this.receptionChannel;
	}

	public void setReceptionChannel(String receptionChannel) {
		this.receptionChannel = receptionChannel;
	}

	public String getReceptionFrequency() {
		return this.receptionFrequency;
	}

	public void setReceptionFrequency(String receptionFrequency) {
		this.receptionFrequency = receptionFrequency;
	}

	public String getReceptionPolarization() {
		return this.receptionPolarization;
	}

	public void setReceptionPolarization(String receptionPolarization) {
		this.receptionPolarization = receptionPolarization;
	}

	public String getServIdHelios() {
		return this.servIdHelios;
	}

	public void setServIdHelios(String servIdHelios) {
		this.servIdHelios = servIdHelios;
	}

	public String getServiceExternalName() {
		return this.serviceExternalName;
	}

	public void setServiceExternalName(String serviceExternalName) {
		this.serviceExternalName = serviceExternalName;
	}

	public String getSfn() {
		return this.sfn;
	}

	public void setSfn(String sfn) {
		this.sfn = sfn;
	}

	public String getSlaName() {
		return this.slaName;
	}

	public void setSlaName(String slaName) {
		this.slaName = slaName;
	}

	public String getSourceIdentifier() {
		return this.sourceIdentifier;
	}

	public void setSourceIdentifier(String sourceIdentifier) {
		this.sourceIdentifier = sourceIdentifier;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public byte getStreaming() {
		return this.streaming;
	}

	public void setStreaming(byte streaming) {
		this.streaming = streaming;
	}

	public String getTdf() {
		return this.tdf;
	}

	public void setTdf(String tdf) {
		this.tdf = tdf;
	}

	public byte getTelemetryAvailable() {
		return this.telemetryAvailable;
	}

	public void setTelemetryAvailable(byte telemetryAvailable) {
		this.telemetryAvailable = telemetryAvailable;
	}

	public String getWolfIdentifier() {
		return this.wolfIdentifier;
	}

	public void setWolfIdentifier(String wolfIdentifier) {
		this.wolfIdentifier = wolfIdentifier;
	}

	public List<F3RegionServicePoint> getF3RegionServicePoints() {
		return this.f3RegionServicePoints;
	}

	public void setF3RegionServicePoints(List<F3RegionServicePoint> f3RegionServicePoints) {
		this.f3RegionServicePoints = f3RegionServicePoints;
	}

	public F3RegionServicePoint addF3RegionServicePoint(F3RegionServicePoint f3RegionServicePoint) {
		getF3RegionServicePoints().add(f3RegionServicePoint);
		f3RegionServicePoint.setServicePoint(this);

		return f3RegionServicePoint;
	}

	public F3RegionServicePoint removeF3RegionServicePoint(F3RegionServicePoint f3RegionServicePoint) {
		getF3RegionServicePoints().remove(f3RegionServicePoint);
		f3RegionServicePoint.setServicePoint(null);

		return f3RegionServicePoint;
	}

	public List<MenuServicePoint> getMenuServicePoints() {
		return this.menuServicePoints;
	}

	public void setMenuServicePoints(List<MenuServicePoint> menuServicePoints) {
		this.menuServicePoints = menuServicePoints;
	}

	public MenuServicePoint addMenuServicePoint(MenuServicePoint menuServicePoint) {
		getMenuServicePoints().add(menuServicePoint);
		menuServicePoint.setServicePoint(this);

		return menuServicePoint;
	}

	public MenuServicePoint removeMenuServicePoint(MenuServicePoint menuServicePoint) {
		getMenuServicePoints().remove(menuServicePoint);
		menuServicePoint.setServicePoint(null);

		return menuServicePoint;
	}

	public List<NetworkLinkServicePointEventType> getNetworkLinkServicePointEventTypes() {
		return this.networkLinkServicePointEventTypes;
	}

	public void setNetworkLinkServicePointEventTypes(List<NetworkLinkServicePointEventType> networkLinkServicePointEventTypes) {
		this.networkLinkServicePointEventTypes = networkLinkServicePointEventTypes;
	}

	public NetworkLinkServicePointEventType addNetworkLinkServicePointEventType(NetworkLinkServicePointEventType networkLinkServicePointEventType) {
		getNetworkLinkServicePointEventTypes().add(networkLinkServicePointEventType);
		networkLinkServicePointEventType.setServicePoint(this);

		return networkLinkServicePointEventType;
	}

	public NetworkLinkServicePointEventType removeNetworkLinkServicePointEventType(NetworkLinkServicePointEventType networkLinkServicePointEventType) {
		getNetworkLinkServicePointEventTypes().remove(networkLinkServicePointEventType);
		networkLinkServicePointEventType.setServicePoint(null);

		return networkLinkServicePointEventType;
	}

	public List<ProfileHistoryStreaming> getProfileHistoryStreamings() {
		return this.profileHistoryStreamings;
	}

	public void setProfileHistoryStreamings(List<ProfileHistoryStreaming> profileHistoryStreamings) {
		this.profileHistoryStreamings = profileHistoryStreamings;
	}

	public ProfileHistoryStreaming addProfileHistoryStreaming(ProfileHistoryStreaming profileHistoryStreaming) {
		getProfileHistoryStreamings().add(profileHistoryStreaming);
		profileHistoryStreaming.setServicePoint(this);

		return profileHistoryStreaming;
	}

	public ProfileHistoryStreaming removeProfileHistoryStreaming(ProfileHistoryStreaming profileHistoryStreaming) {
		getProfileHistoryStreamings().remove(profileHistoryStreaming);
		profileHistoryStreaming.setServicePoint(null);

		return profileHistoryStreaming;
	}

	public List<ProfileLiveStreaming> getProfileLiveStreamings() {
		return this.profileLiveStreamings;
	}

	public void setProfileLiveStreamings(List<ProfileLiveStreaming> profileLiveStreamings) {
		this.profileLiveStreamings = profileLiveStreamings;
	}

	public ProfileLiveStreaming addProfileLiveStreaming(ProfileLiveStreaming profileLiveStreaming) {
		getProfileLiveStreamings().add(profileLiveStreaming);
		profileLiveStreaming.setServicePoint(this);

		return profileLiveStreaming;
	}

	public ProfileLiveStreaming removeProfileLiveStreaming(ProfileLiveStreaming profileLiveStreaming) {
		getProfileLiveStreamings().remove(profileLiveStreaming);
		profileLiveStreaming.setServicePoint(null);

		return profileLiveStreaming;
	}

	public List<ProfileServicePoint> getProfileServicePoints() {
		return this.profileServicePoints;
	}

	public void setProfileServicePoints(List<ProfileServicePoint> profileServicePoints) {
		this.profileServicePoints = profileServicePoints;
	}

	public ProfileServicePoint addProfileServicePoint(ProfileServicePoint profileServicePoint) {
		getProfileServicePoints().add(profileServicePoint);
		profileServicePoint.setServicePoint(this);

		return profileServicePoint;
	}

	public ProfileServicePoint removeProfileServicePoint(ProfileServicePoint profileServicePoint) {
		getProfileServicePoints().remove(profileServicePoint);
		profileServicePoint.setServicePoint(null);

		return profileServicePoint;
	}

	public List<ProfileServicePointEventType> getProfileServicePointEventTypes() {
		return this.profileServicePointEventTypes;
	}

	public void setProfileServicePointEventTypes(List<ProfileServicePointEventType> profileServicePointEventTypes) {
		this.profileServicePointEventTypes = profileServicePointEventTypes;
	}

	public ProfileServicePointEventType addProfileServicePointEventType(ProfileServicePointEventType profileServicePointEventType) {
		getProfileServicePointEventTypes().add(profileServicePointEventType);
		profileServicePointEventType.setServicePoint(this);

		return profileServicePointEventType;
	}

	public ProfileServicePointEventType removeProfileServicePointEventType(ProfileServicePointEventType profileServicePointEventType) {
		getProfileServicePointEventTypes().remove(profileServicePointEventType);
		profileServicePointEventType.setServicePoint(null);

		return profileServicePointEventType;
	}

	public List<Resource> getResources() {
		return this.resources;
	}

	public void setResources(List<Resource> resources) {
		this.resources = resources;
	}

	public Resource addResource(Resource resource) {
		getResources().add(resource);
		resource.setServicePoint(this);

		return resource;
	}

	public Resource removeResource(Resource resource) {
		getResources().remove(resource);
		resource.setServicePoint(null);

		return resource;
	}

	public List<ResourceServicePoint> getResourceServicePoints() {
		return this.resourceServicePoints;
	}

	public void setResourceServicePoints(List<ResourceServicePoint> resourceServicePoints) {
		this.resourceServicePoints = resourceServicePoints;
	}

	public ResourceServicePoint addResourceServicePoint(ResourceServicePoint resourceServicePoint) {
		getResourceServicePoints().add(resourceServicePoint);
		resourceServicePoint.setServicePoint(this);

		return resourceServicePoint;
	}

	public ResourceServicePoint removeResourceServicePoint(ResourceServicePoint resourceServicePoint) {
		getResourceServicePoints().remove(resourceServicePoint);
		resourceServicePoint.setServicePoint(null);

		return resourceServicePoint;
	}

	public ServicePointProvider getServicePointProvider() {
		return this.servicePointProvider;
	}

	public void setServicePointProvider(ServicePointProvider servicePointProvider) {
		this.servicePointProvider = servicePointProvider;
	}

	public MonitoringEquipment getMonitoringEquipment() {
		return this.monitoringEquipment;
	}

	public void setMonitoringEquipment(MonitoringEquipment monitoringEquipment) {
		this.monitoringEquipment = monitoringEquipment;
	}

	public ServicePointType getServicePointType() {
		return this.servicePointType;
	}

	public void setServicePointType(ServicePointType servicePointType) {
		this.servicePointType = servicePointType;
	}

	public Synoptic getSynoptic() {
		return this.synoptic;
	}

	public void setSynoptic(Synoptic synoptic) {
		this.synoptic = synoptic;
	}

	public ServicePointSla getServicePointSla() {
		return this.servicePointSla;
	}

	public void setServicePointSla(ServicePointSla servicePointSla) {
		this.servicePointSla = servicePointSla;
	}

	public ServicePointContractType getServicePointContractType() {
		return this.servicePointContractType;
	}

	public void setServicePointContractType(ServicePointContractType servicePointContractType) {
		this.servicePointContractType = servicePointContractType;
	}

	public Service getService() {
		return this.service;
	}

	public void setService(Service service) {
		this.service = service;
	}

	public ServicePointStatus getServicePointStatus() {
		return this.servicePointStatus;
	}

	public void setServicePointStatus(ServicePointStatus servicePointStatus) {
		this.servicePointStatus = servicePointStatus;
	}

	public GeoSite getGeoSite() {
		return this.geoSite;
	}

	public void setGeoSite(GeoSite geoSite) {
		this.geoSite = geoSite;
	}

	public List<SynopticComponent> getSynopticComponents() {
		return this.synopticComponents;
	}

	public void setSynopticComponents(List<SynopticComponent> synopticComponents) {
		this.synopticComponents = synopticComponents;
	}

	public SynopticComponent addSynopticComponent(SynopticComponent synopticComponent) {
		getSynopticComponents().add(synopticComponent);
		synopticComponent.setServicePoint(this);

		return synopticComponent;
	}

	public SynopticComponent removeSynopticComponent(SynopticComponent synopticComponent) {
		getSynopticComponents().remove(synopticComponent);
		synopticComponent.setServicePoint(null);

		return synopticComponent;
	}

	public List<Telemetry> getTelemetries() {
		return this.telemetries;
	}

	public void setTelemetries(List<Telemetry> telemetries) {
		this.telemetries = telemetries;
	}

	public Telemetry addTelemetry(Telemetry telemetry) {
		getTelemetries().add(telemetry);
		telemetry.setServicePoint(this);

		return telemetry;
	}

	public Telemetry removeTelemetry(Telemetry telemetry) {
		getTelemetries().remove(telemetry);
		telemetry.setServicePoint(null);

		return telemetry;
	}

	public List<TransportServicePoint> getTransportServicePoints() {
		return this.transportServicePoints;
	}

	public void setTransportServicePoints(List<TransportServicePoint> transportServicePoints) {
		this.transportServicePoints = transportServicePoints;
	}

	public TransportServicePoint addTransportServicePoint(TransportServicePoint transportServicePoint) {
		getTransportServicePoints().add(transportServicePoint);
		transportServicePoint.setServicePoint(this);

		return transportServicePoint;
	}

	public TransportServicePoint removeTransportServicePoint(TransportServicePoint transportServicePoint) {
		getTransportServicePoints().remove(transportServicePoint);
		transportServicePoint.setServicePoint(null);

		return transportServicePoint;
	}

}