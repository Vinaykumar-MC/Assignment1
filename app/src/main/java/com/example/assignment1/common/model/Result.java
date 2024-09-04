package com.example.assignment1.common.model;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.processing.Generated;

@Generated("jsonschema2pojo")
public class Result {

    @SerializedName("id")
    @Expose
    private long id;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("type")
    @Expose
    private long type;
    @SerializedName("primary_details")
    @Expose
    private PrimaryDetails primaryDetails;
    @SerializedName("fee_details")
    @Expose
    private FeeDetails feeDetails;
    @SerializedName("job_tags")
    @Expose
    private List<JobTag> jobTags = new ArrayList<JobTag>();
    @SerializedName("job_type")
    @Expose
    private long jobType;
    @SerializedName("job_category_id")
    @Expose
    private long jobCategoryId;
    @SerializedName("qualification")
    @Expose
    private long qualification;
    @SerializedName("experience")
    @Expose
    private long experience;
    @SerializedName("shift_timing")
    @Expose
    private long shiftTiming;
    @SerializedName("job_role_id")
    @Expose
    private long jobRoleId;
    @SerializedName("salary_max")
    @Expose
    private long salaryMax;
    @SerializedName("salary_min")
    @Expose
    private long salaryMin;
    @SerializedName("city_location")
    @Expose
    private long cityLocation;
    @SerializedName("locality")
    @Expose
    private long locality;
    @SerializedName("premium_till")
    @Expose
    private String premiumTill;
    @SerializedName("company_name")
    @Expose
    private String companyName;
    @SerializedName("advertiser")
    @Expose
    private long advertiser;
    @SerializedName("button_text")
    @Expose
    private String buttonText;
    @SerializedName("custom_link")
    @Expose
    private String customLink;
    @SerializedName("amount")
    @Expose
    private String amount;
    @SerializedName("views")
    @Expose
    private long views;
    @SerializedName("shares")
    @Expose
    private long shares;
    @SerializedName("fb_shares")
    @Expose
    private long fbShares;
    @SerializedName("is_bookmarked")
    @Expose
    private boolean isBookmarked;
    @SerializedName("is_applied")
    @Expose
    private boolean isApplied;
    @SerializedName("is_owner")
    @Expose
    private boolean isOwner;
    @SerializedName("updated_on")
    @Expose
    private String updatedOn;
    @SerializedName("whatsapp_no")
    @Expose
    private String whatsappNo;
    @SerializedName("contact_preference")
    @Expose
    private ContactPreference contactPreference;
    @SerializedName("created_on")
    @Expose
    private String createdOn;
    @SerializedName("is_premium")
    @Expose
    private boolean isPremium;
    @SerializedName("creatives")
    @Expose
    private List<Creative> creatives = new ArrayList<Creative>();
    @SerializedName("videos")
    @Expose
    private List<Object> videos = new ArrayList<Object>();
    @SerializedName("locations")
    @Expose
    private List<Location> locations = new ArrayList<Location>();
    @SerializedName("tags")
    @Expose
    private List<Object> tags = new ArrayList<Object>();
    @SerializedName("contentV3")
    @Expose
    private ContentV3 contentV3;
    @SerializedName("status")
    @Expose
    private long status;
    @SerializedName("expire_on")
    @Expose
    private String expireOn;
    @SerializedName("job_hours")
    @Expose
    private String jobHours;
    @SerializedName("openings_count")
    @Expose
    private long openingsCount;
    @SerializedName("job_role")
    @Expose
    private String jobRole;
    @SerializedName("other_details")
    @Expose
    private String otherDetails;
    @SerializedName("job_category")
    @Expose
    private String jobCategory;
    @SerializedName("num_applications")
    @Expose
    private long numApplications;
    @SerializedName("enable_lead_collection")
    @Expose
    private boolean enableLeadCollection;
    @SerializedName("is_job_seeker_profile_mandatory")
    @Expose
    private boolean isJobSeekerProfileMandatory;
    @SerializedName("translated_content")
    @Expose
    private TranslatedContent translatedContent;
    @SerializedName("job_location_slug")
    @Expose
    private String jobLocationSlug;
    @SerializedName("fees_text")
    @Expose
    private String feesText;
    @SerializedName("question_bank_id")
    @Expose
    private Object questionBankId;
    @SerializedName("screening_retry")
    @Expose
    private Object screeningRetry;
    @SerializedName("should_show_last_contacted")
    @Expose
    private boolean shouldShowLastContacted;
    @SerializedName("fees_charged")
    @Expose
    private long feesCharged;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Result withId(long id) {
        this.id = id;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Result withTitle(String title) {
        this.title = title;
        return this;
    }

    public long getType() {
        return type;
    }

    public void setType(long type) {
        this.type = type;
    }

    public Result withType(long type) {
        this.type = type;
        return this;
    }

    public PrimaryDetails getPrimaryDetails() {
        return primaryDetails;
    }

    public void setPrimaryDetails(PrimaryDetails primaryDetails) {
        this.primaryDetails = primaryDetails;
    }

    public Result withPrimaryDetails(PrimaryDetails primaryDetails) {
        this.primaryDetails = primaryDetails;
        return this;
    }

    public FeeDetails getFeeDetails() {
        return feeDetails;
    }

    public void setFeeDetails(FeeDetails feeDetails) {
        this.feeDetails = feeDetails;
    }

    public Result withFeeDetails(FeeDetails feeDetails) {
        this.feeDetails = feeDetails;
        return this;
    }

    public List<JobTag> getJobTags() {
        return jobTags;
    }

    public void setJobTags(List<JobTag> jobTags) {
        this.jobTags = jobTags;
    }

    public Result withJobTags(List<JobTag> jobTags) {
        this.jobTags = jobTags;
        return this;
    }

    public long getJobType() {
        return jobType;
    }

    public void setJobType(long jobType) {
        this.jobType = jobType;
    }

    public Result withJobType(long jobType) {
        this.jobType = jobType;
        return this;
    }

    public long getJobCategoryId() {
        return jobCategoryId;
    }

    public void setJobCategoryId(long jobCategoryId) {
        this.jobCategoryId = jobCategoryId;
    }

    public Result withJobCategoryId(long jobCategoryId) {
        this.jobCategoryId = jobCategoryId;
        return this;
    }

    public long getQualification() {
        return qualification;
    }

    public void setQualification(long qualification) {
        this.qualification = qualification;
    }

    public Result withQualification(long qualification) {
        this.qualification = qualification;
        return this;
    }

    public long getExperience() {
        return experience;
    }

    public void setExperience(long experience) {
        this.experience = experience;
    }

    public Result withExperience(long experience) {
        this.experience = experience;
        return this;
    }

    public long getShiftTiming() {
        return shiftTiming;
    }

    public void setShiftTiming(long shiftTiming) {
        this.shiftTiming = shiftTiming;
    }

    public Result withShiftTiming(long shiftTiming) {
        this.shiftTiming = shiftTiming;
        return this;
    }

    public long getJobRoleId() {
        return jobRoleId;
    }

    public void setJobRoleId(long jobRoleId) {
        this.jobRoleId = jobRoleId;
    }

    public Result withJobRoleId(long jobRoleId) {
        this.jobRoleId = jobRoleId;
        return this;
    }

    public long getSalaryMax() {
        return salaryMax;
    }

    public void setSalaryMax(long salaryMax) {
        this.salaryMax = salaryMax;
    }

    public Result withSalaryMax(long salaryMax) {
        this.salaryMax = salaryMax;
        return this;
    }

    public long getSalaryMin() {
        return salaryMin;
    }

    public void setSalaryMin(long salaryMin) {
        this.salaryMin = salaryMin;
    }

    public Result withSalaryMin(long salaryMin) {
        this.salaryMin = salaryMin;
        return this;
    }

    public long getCityLocation() {
        return cityLocation;
    }

    public void setCityLocation(long cityLocation) {
        this.cityLocation = cityLocation;
    }

    public Result withCityLocation(long cityLocation) {
        this.cityLocation = cityLocation;
        return this;
    }

    public long getLocality() {
        return locality;
    }

    public void setLocality(long locality) {
        this.locality = locality;
    }

    public Result withLocality(long locality) {
        this.locality = locality;
        return this;
    }

    public String getPremiumTill() {
        return premiumTill;
    }

    public void setPremiumTill(String premiumTill) {
        this.premiumTill = premiumTill;
    }

    public Result withPremiumTill(String premiumTill) {
        this.premiumTill = premiumTill;
        return this;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Result withCompanyName(String companyName) {
        this.companyName = companyName;
        return this;
    }

    public long getAdvertiser() {
        return advertiser;
    }

    public void setAdvertiser(long advertiser) {
        this.advertiser = advertiser;
    }

    public Result withAdvertiser(long advertiser) {
        this.advertiser = advertiser;
        return this;
    }

    public String getButtonText() {
        return buttonText;
    }

    public void setButtonText(String buttonText) {
        this.buttonText = buttonText;
    }

    public Result withButtonText(String buttonText) {
        this.buttonText = buttonText;
        return this;
    }

    public String getCustomLink() {
        return customLink;
    }

    public void setCustomLink(String customLink) {
        this.customLink = customLink;
    }

    public Result withCustomLink(String customLink) {
        this.customLink = customLink;
        return this;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public Result withAmount(String amount) {
        this.amount = amount;
        return this;
    }

    public long getViews() {
        return views;
    }

    public void setViews(long views) {
        this.views = views;
    }

    public Result withViews(long views) {
        this.views = views;
        return this;
    }

    public long getShares() {
        return shares;
    }

    public void setShares(long shares) {
        this.shares = shares;
    }

    public Result withShares(long shares) {
        this.shares = shares;
        return this;
    }

    public long getFbShares() {
        return fbShares;
    }

    public void setFbShares(long fbShares) {
        this.fbShares = fbShares;
    }

    public Result withFbShares(long fbShares) {
        this.fbShares = fbShares;
        return this;
    }

    public boolean isIsBookmarked() {
        return isBookmarked;
    }

    public void setIsBookmarked(boolean isBookmarked) {
        this.isBookmarked = isBookmarked;
    }

    public Result withIsBookmarked(boolean isBookmarked) {
        this.isBookmarked = isBookmarked;
        return this;
    }

    public boolean isIsApplied() {
        return isApplied;
    }

    public void setIsApplied(boolean isApplied) {
        this.isApplied = isApplied;
    }

    public Result withIsApplied(boolean isApplied) {
        this.isApplied = isApplied;
        return this;
    }

    public boolean isIsOwner() {
        return isOwner;
    }

    public void setIsOwner(boolean isOwner) {
        this.isOwner = isOwner;
    }

    public Result withIsOwner(boolean isOwner) {
        this.isOwner = isOwner;
        return this;
    }

    public String getUpdatedOn() {
        return updatedOn;
    }

    public void setUpdatedOn(String updatedOn) {
        this.updatedOn = updatedOn;
    }

    public Result withUpdatedOn(String updatedOn) {
        this.updatedOn = updatedOn;
        return this;
    }

    public String getWhatsappNo() {
        return whatsappNo;
    }

    public void setWhatsappNo(String whatsappNo) {
        this.whatsappNo = whatsappNo;
    }

    public Result withWhatsappNo(String whatsappNo) {
        this.whatsappNo = whatsappNo;
        return this;
    }

    public ContactPreference getContactPreference() {
        return contactPreference;
    }

    public void setContactPreference(ContactPreference contactPreference) {
        this.contactPreference = contactPreference;
    }

    public Result withContactPreference(ContactPreference contactPreference) {
        this.contactPreference = contactPreference;
        return this;
    }

    public String getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(String createdOn) {
        this.createdOn = createdOn;
    }

    public Result withCreatedOn(String createdOn) {
        this.createdOn = createdOn;
        return this;
    }

    public boolean isIsPremium() {
        return isPremium;
    }

    public void setIsPremium(boolean isPremium) {
        this.isPremium = isPremium;
    }

    public Result withIsPremium(boolean isPremium) {
        this.isPremium = isPremium;
        return this;
    }

    public List<Creative> getCreatives() {
        return creatives;
    }

    public void setCreatives(List<Creative> creatives) {
        this.creatives = creatives;
    }

    public Result withCreatives(List<Creative> creatives) {
        this.creatives = creatives;
        return this;
    }

    public List<Object> getVideos() {
        return videos;
    }

    public void setVideos(List<Object> videos) {
        this.videos = videos;
    }

    public Result withVideos(List<Object> videos) {
        this.videos = videos;
        return this;
    }

    public List<Location> getLocations() {
        return locations;
    }

    public void setLocations(List<Location> locations) {
        this.locations = locations;
    }

    public Result withLocations(List<Location> locations) {
        this.locations = locations;
        return this;
    }

    public List<Object> getTags() {
        return tags;
    }

    public void setTags(List<Object> tags) {
        this.tags = tags;
    }

    public Result withTags(List<Object> tags) {
        this.tags = tags;
        return this;
    }

    public ContentV3 getContentV3() {
        return contentV3;
    }

    public void setContentV3(ContentV3 contentV3) {
        this.contentV3 = contentV3;
    }

    public Result withContentV3(ContentV3 contentV3) {
        this.contentV3 = contentV3;
        return this;
    }

    public long getStatus() {
        return status;
    }

    public void setStatus(long status) {
        this.status = status;
    }

    public Result withStatus(long status) {
        this.status = status;
        return this;
    }

    public String getExpireOn() {
        return expireOn;
    }

    public void setExpireOn(String expireOn) {
        this.expireOn = expireOn;
    }

    public Result withExpireOn(String expireOn) {
        this.expireOn = expireOn;
        return this;
    }

    public String getJobHours() {
        return jobHours;
    }

    public void setJobHours(String jobHours) {
        this.jobHours = jobHours;
    }

    public Result withJobHours(String jobHours) {
        this.jobHours = jobHours;
        return this;
    }

    public long getOpeningsCount() {
        return openingsCount;
    }

    public void setOpeningsCount(long openingsCount) {
        this.openingsCount = openingsCount;
    }

    public Result withOpeningsCount(long openingsCount) {
        this.openingsCount = openingsCount;
        return this;
    }

    public String getJobRole() {
        return jobRole;
    }

    public void setJobRole(String jobRole) {
        this.jobRole = jobRole;
    }

    public Result withJobRole(String jobRole) {
        this.jobRole = jobRole;
        return this;
    }

    public String getOtherDetails() {
        return otherDetails;
    }

    public void setOtherDetails(String otherDetails) {
        this.otherDetails = otherDetails;
    }

    public Result withOtherDetails(String otherDetails) {
        this.otherDetails = otherDetails;
        return this;
    }

    public String getJobCategory() {
        return jobCategory;
    }

    public void setJobCategory(String jobCategory) {
        this.jobCategory = jobCategory;
    }

    public Result withJobCategory(String jobCategory) {
        this.jobCategory = jobCategory;
        return this;
    }

    public long getNumApplications() {
        return numApplications;
    }

    public void setNumApplications(long numApplications) {
        this.numApplications = numApplications;
    }

    public Result withNumApplications(long numApplications) {
        this.numApplications = numApplications;
        return this;
    }

    public boolean isEnableLeadCollection() {
        return enableLeadCollection;
    }

    public void setEnableLeadCollection(boolean enableLeadCollection) {
        this.enableLeadCollection = enableLeadCollection;
    }

    public Result withEnableLeadCollection(boolean enableLeadCollection) {
        this.enableLeadCollection = enableLeadCollection;
        return this;
    }

    public boolean isIsJobSeekerProfileMandatory() {
        return isJobSeekerProfileMandatory;
    }

    public void setIsJobSeekerProfileMandatory(boolean isJobSeekerProfileMandatory) {
        this.isJobSeekerProfileMandatory = isJobSeekerProfileMandatory;
    }

    public Result withIsJobSeekerProfileMandatory(boolean isJobSeekerProfileMandatory) {
        this.isJobSeekerProfileMandatory = isJobSeekerProfileMandatory;
        return this;
    }

    public TranslatedContent getTranslatedContent() {
        return translatedContent;
    }

    public void setTranslatedContent(TranslatedContent translatedContent) {
        this.translatedContent = translatedContent;
    }

    public Result withTranslatedContent(TranslatedContent translatedContent) {
        this.translatedContent = translatedContent;
        return this;
    }

    public String getJobLocationSlug() {
        return jobLocationSlug;
    }

    public void setJobLocationSlug(String jobLocationSlug) {
        this.jobLocationSlug = jobLocationSlug;
    }

    public Result withJobLocationSlug(String jobLocationSlug) {
        this.jobLocationSlug = jobLocationSlug;
        return this;
    }

    public String getFeesText() {
        return feesText;
    }

    public void setFeesText(String feesText) {
        this.feesText = feesText;
    }

    public Result withFeesText(String feesText) {
        this.feesText = feesText;
        return this;
    }

    public Object getQuestionBankId() {
        return questionBankId;
    }

    public void setQuestionBankId(Object questionBankId) {
        this.questionBankId = questionBankId;
    }

    public Result withQuestionBankId(Object questionBankId) {
        this.questionBankId = questionBankId;
        return this;
    }

    public Object getScreeningRetry() {
        return screeningRetry;
    }

    public void setScreeningRetry(Object screeningRetry) {
        this.screeningRetry = screeningRetry;
    }

    public Result withScreeningRetry(Object screeningRetry) {
        this.screeningRetry = screeningRetry;
        return this;
    }

    public boolean isShouldShowLastContacted() {
        return shouldShowLastContacted;
    }

    public void setShouldShowLastContacted(boolean shouldShowLastContacted) {
        this.shouldShowLastContacted = shouldShowLastContacted;
    }

    public Result withShouldShowLastContacted(boolean shouldShowLastContacted) {
        this.shouldShowLastContacted = shouldShowLastContacted;
        return this;
    }

    public long getFeesCharged() {
        return feesCharged;
    }

    public void setFeesCharged(long feesCharged) {
        this.feesCharged = feesCharged;
    }

    public Result withFeesCharged(long feesCharged) {
        this.feesCharged = feesCharged;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Result.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(this.id);
        sb.append(',');
        sb.append("title");
        sb.append('=');
        sb.append(((this.title == null)?"<null>":this.title));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(this.type);
        sb.append(',');
        sb.append("primaryDetails");
        sb.append('=');
        sb.append(((this.primaryDetails == null)?"<null>":this.primaryDetails));
        sb.append(',');
        sb.append("feeDetails");
        sb.append('=');
        sb.append(((this.feeDetails == null)?"<null>":this.feeDetails));
        sb.append(',');
        sb.append("jobTags");
        sb.append('=');
        sb.append(((this.jobTags == null)?"<null>":this.jobTags));
        sb.append(',');
        sb.append("jobType");
        sb.append('=');
        sb.append(this.jobType);
        sb.append(',');
        sb.append("jobCategoryId");
        sb.append('=');
        sb.append(this.jobCategoryId);
        sb.append(',');
        sb.append("qualification");
        sb.append('=');
        sb.append(this.qualification);
        sb.append(',');
        sb.append("experience");
        sb.append('=');
        sb.append(this.experience);
        sb.append(',');
        sb.append("shiftTiming");
        sb.append('=');
        sb.append(this.shiftTiming);
        sb.append(',');
        sb.append("jobRoleId");
        sb.append('=');
        sb.append(this.jobRoleId);
        sb.append(',');
        sb.append("salaryMax");
        sb.append('=');
        sb.append(this.salaryMax);
        sb.append(',');
        sb.append("salaryMin");
        sb.append('=');
        sb.append(this.salaryMin);
        sb.append(',');
        sb.append("cityLocation");
        sb.append('=');
        sb.append(this.cityLocation);
        sb.append(',');
        sb.append("locality");
        sb.append('=');
        sb.append(this.locality);
        sb.append(',');
        sb.append("premiumTill");
        sb.append('=');
        sb.append(((this.premiumTill == null)?"<null>":this.premiumTill));
        sb.append(',');
        sb.append("companyName");
        sb.append('=');
        sb.append(((this.companyName == null)?"<null>":this.companyName));
        sb.append(',');
        sb.append("advertiser");
        sb.append('=');
        sb.append(this.advertiser);
        sb.append(',');
        sb.append("buttonText");
        sb.append('=');
        sb.append(((this.buttonText == null)?"<null>":this.buttonText));
        sb.append(',');
        sb.append("customLink");
        sb.append('=');
        sb.append(((this.customLink == null)?"<null>":this.customLink));
        sb.append(',');
        sb.append("amount");
        sb.append('=');
        sb.append(((this.amount == null)?"<null>":this.amount));
        sb.append(',');
        sb.append("views");
        sb.append('=');
        sb.append(this.views);
        sb.append(',');
        sb.append("shares");
        sb.append('=');
        sb.append(this.shares);
        sb.append(',');
        sb.append("fbShares");
        sb.append('=');
        sb.append(this.fbShares);
        sb.append(',');
        sb.append("isBookmarked");
        sb.append('=');
        sb.append(this.isBookmarked);
        sb.append(',');
        sb.append("isApplied");
        sb.append('=');
        sb.append(this.isApplied);
        sb.append(',');
        sb.append("isOwner");
        sb.append('=');
        sb.append(this.isOwner);
        sb.append(',');
        sb.append("updatedOn");
        sb.append('=');
        sb.append(((this.updatedOn == null)?"<null>":this.updatedOn));
        sb.append(',');
        sb.append("whatsappNo");
        sb.append('=');
        sb.append(((this.whatsappNo == null)?"<null>":this.whatsappNo));
        sb.append(',');
        sb.append("contactPreference");
        sb.append('=');
        sb.append(((this.contactPreference == null)?"<null>":this.contactPreference));
        sb.append(',');
        sb.append("createdOn");
        sb.append('=');
        sb.append(((this.createdOn == null)?"<null>":this.createdOn));
        sb.append(',');
        sb.append("isPremium");
        sb.append('=');
        sb.append(this.isPremium);
        sb.append(',');
        sb.append("creatives");
        sb.append('=');
        sb.append(((this.creatives == null)?"<null>":this.creatives));
        sb.append(',');
        sb.append("videos");
        sb.append('=');
        sb.append(((this.videos == null)?"<null>":this.videos));
        sb.append(',');
        sb.append("locations");
        sb.append('=');
        sb.append(((this.locations == null)?"<null>":this.locations));
        sb.append(',');
        sb.append("tags");
        sb.append('=');
        sb.append(((this.tags == null)?"<null>":this.tags));
        sb.append(',');
        sb.append("contentV3");
        sb.append('=');
        sb.append(((this.contentV3 == null)?"<null>":this.contentV3));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(this.status);
        sb.append(',');
        sb.append("expireOn");
        sb.append('=');
        sb.append(((this.expireOn == null)?"<null>":this.expireOn));
        sb.append(',');
        sb.append("jobHours");
        sb.append('=');
        sb.append(((this.jobHours == null)?"<null>":this.jobHours));
        sb.append(',');
        sb.append("openingsCount");
        sb.append('=');
        sb.append(this.openingsCount);
        sb.append(',');
        sb.append("jobRole");
        sb.append('=');
        sb.append(((this.jobRole == null)?"<null>":this.jobRole));
        sb.append(',');
        sb.append("otherDetails");
        sb.append('=');
        sb.append(((this.otherDetails == null)?"<null>":this.otherDetails));
        sb.append(',');
        sb.append("jobCategory");
        sb.append('=');
        sb.append(((this.jobCategory == null)?"<null>":this.jobCategory));
        sb.append(',');
        sb.append("numApplications");
        sb.append('=');
        sb.append(this.numApplications);
        sb.append(',');
        sb.append("enableLeadCollection");
        sb.append('=');
        sb.append(this.enableLeadCollection);
        sb.append(',');
        sb.append("isJobSeekerProfileMandatory");
        sb.append('=');
        sb.append(this.isJobSeekerProfileMandatory);
        sb.append(',');
        sb.append("translatedContent");
        sb.append('=');
        sb.append(((this.translatedContent == null)?"<null>":this.translatedContent));
        sb.append(',');
        sb.append("jobLocationSlug");
        sb.append('=');
        sb.append(((this.jobLocationSlug == null)?"<null>":this.jobLocationSlug));
        sb.append(',');
        sb.append("feesText");
        sb.append('=');
        sb.append(((this.feesText == null)?"<null>":this.feesText));
        sb.append(',');
        sb.append("questionBankId");
        sb.append('=');
        sb.append(((this.questionBankId == null)?"<null>":this.questionBankId));
        sb.append(',');
        sb.append("screeningRetry");
        sb.append('=');
        sb.append(((this.screeningRetry == null)?"<null>":this.screeningRetry));
        sb.append(',');
        sb.append("shouldShowLastContacted");
        sb.append('=');
        sb.append(this.shouldShowLastContacted);
        sb.append(',');
        sb.append("feesCharged");
        sb.append('=');
        sb.append(this.feesCharged);
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}

