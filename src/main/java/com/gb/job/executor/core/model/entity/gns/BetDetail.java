package com.gb.job.executor.core.model.entity.gns;

import java.time.LocalDateTime;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table t_gns_bet_detail
 */
public class BetDetail {
    /**
     * Database Column Remarks:
     *   产品供应商代码
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_gns_bet_detail.partner_data
     *
     * @mbg.generated
     */
    private String partnerData;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_gns_bet_detail.timestamp
     *
     * @mbg.generated
     */
    private LocalDateTime timestamp;

    /**
     * Database Column Remarks:
     *   玩家账号
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_gns_bet_detail.user_id
     *
     * @mbg.generated
     */
    private String userId;

    /**
     * Database Column Remarks:
     *   游戏ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_gns_bet_detail.game_id
     *
     * @mbg.generated
     */
    private String gameId;

    /**
     * Database Column Remarks:
     *   交易ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_gns_bet_detail.causality
     *
     * @mbg.generated
     */
    private String causality;

    /**
     * Database Column Remarks:
     *   货币代码
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_gns_bet_detail.currency
     *
     * @mbg.generated
     */
    private String currency;

    /**
     * Database Column Remarks:
     *   總下注數
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_gns_bet_detail.total_bet
     *
     * @mbg.generated
     */
    private String totalBet;

    /**
     * Database Column Remarks:
     *   總获胜數
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_gns_bet_detail.total_won
     *
     * @mbg.generated
     */
    private String totalWon;

    /**
     * Database Column Remarks:
     *   余额
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_gns_bet_detail.balance
     *
     * @mbg.generated
     */
    private String balance;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_gns_bet_detail.merchantcode
     *
     * @mbg.generated
     */
    private String merchantcode;

    /**
     * Database Column Remarks:
     *   装置
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_gns_bet_detail.device
     *
     * @mbg.generated
     */
    private String device;

    /**
     * Database Column Remarks:
     *   玩家类型
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_gns_bet_detail.user_type
     *
     * @mbg.generated
     */
    private String userType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_gns_bet_detail.roundid
     *
     * @mbg.generated
     */
    private String roundid;

    /**
     * Database Column Remarks:
     *   头獎ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_gns_bet_detail.jp_id
     *
     * @mbg.generated
     */
    private String jpId;

    /**
     * Database Column Remarks:
     *   头奖金额
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_gns_bet_detail.jpcontrib
     *
     * @mbg.generated
     */
    private String jpcontrib;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_gns_bet_detail.partner_data
     *
     * @return the value of t_gns_bet_detail.partner_data
     *
     * @mbg.generated
     */
    public String getPartnerData() {
        return partnerData;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_gns_bet_detail.partner_data
     *
     * @param partnerData the value for t_gns_bet_detail.partner_data
     *
     * @mbg.generated
     */
    public void setPartnerData(String partnerData) {
        this.partnerData = partnerData == null ? null : partnerData.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_gns_bet_detail.timestamp
     *
     * @return the value of t_gns_bet_detail.timestamp
     *
     * @mbg.generated
     */
    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_gns_bet_detail.timestamp
     *
     * @param timestamp the value for t_gns_bet_detail.timestamp
     *
     * @mbg.generated
     */
    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_gns_bet_detail.user_id
     *
     * @return the value of t_gns_bet_detail.user_id
     *
     * @mbg.generated
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_gns_bet_detail.user_id
     *
     * @param userId the value for t_gns_bet_detail.user_id
     *
     * @mbg.generated
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_gns_bet_detail.game_id
     *
     * @return the value of t_gns_bet_detail.game_id
     *
     * @mbg.generated
     */
    public String getGameId() {
        return gameId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_gns_bet_detail.game_id
     *
     * @param gameId the value for t_gns_bet_detail.game_id
     *
     * @mbg.generated
     */
    public void setGameId(String gameId) {
        this.gameId = gameId == null ? null : gameId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_gns_bet_detail.causality
     *
     * @return the value of t_gns_bet_detail.causality
     *
     * @mbg.generated
     */
    public String getCausality() {
        return causality;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_gns_bet_detail.causality
     *
     * @param causality the value for t_gns_bet_detail.causality
     *
     * @mbg.generated
     */
    public void setCausality(String causality) {
        this.causality = causality == null ? null : causality.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_gns_bet_detail.currency
     *
     * @return the value of t_gns_bet_detail.currency
     *
     * @mbg.generated
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_gns_bet_detail.currency
     *
     * @param currency the value for t_gns_bet_detail.currency
     *
     * @mbg.generated
     */
    public void setCurrency(String currency) {
        this.currency = currency == null ? null : currency.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_gns_bet_detail.total_bet
     *
     * @return the value of t_gns_bet_detail.total_bet
     *
     * @mbg.generated
     */
    public String getTotalBet() {
        return totalBet;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_gns_bet_detail.total_bet
     *
     * @param totalBet the value for t_gns_bet_detail.total_bet
     *
     * @mbg.generated
     */
    public void setTotalBet(String totalBet) {
        this.totalBet = totalBet == null ? null : totalBet.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_gns_bet_detail.total_won
     *
     * @return the value of t_gns_bet_detail.total_won
     *
     * @mbg.generated
     */
    public String getTotalWon() {
        return totalWon;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_gns_bet_detail.total_won
     *
     * @param totalWon the value for t_gns_bet_detail.total_won
     *
     * @mbg.generated
     */
    public void setTotalWon(String totalWon) {
        this.totalWon = totalWon == null ? null : totalWon.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_gns_bet_detail.balance
     *
     * @return the value of t_gns_bet_detail.balance
     *
     * @mbg.generated
     */
    public String getBalance() {
        return balance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_gns_bet_detail.balance
     *
     * @param balance the value for t_gns_bet_detail.balance
     *
     * @mbg.generated
     */
    public void setBalance(String balance) {
        this.balance = balance == null ? null : balance.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_gns_bet_detail.merchantcode
     *
     * @return the value of t_gns_bet_detail.merchantcode
     *
     * @mbg.generated
     */
    public String getMerchantcode() {
        return merchantcode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_gns_bet_detail.merchantcode
     *
     * @param merchantcode the value for t_gns_bet_detail.merchantcode
     *
     * @mbg.generated
     */
    public void setMerchantcode(String merchantcode) {
        this.merchantcode = merchantcode == null ? null : merchantcode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_gns_bet_detail.device
     *
     * @return the value of t_gns_bet_detail.device
     *
     * @mbg.generated
     */
    public String getDevice() {
        return device;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_gns_bet_detail.device
     *
     * @param device the value for t_gns_bet_detail.device
     *
     * @mbg.generated
     */
    public void setDevice(String device) {
        this.device = device == null ? null : device.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_gns_bet_detail.user_type
     *
     * @return the value of t_gns_bet_detail.user_type
     *
     * @mbg.generated
     */
    public String getUserType() {
        return userType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_gns_bet_detail.user_type
     *
     * @param userType the value for t_gns_bet_detail.user_type
     *
     * @mbg.generated
     */
    public void setUserType(String userType) {
        this.userType = userType == null ? null : userType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_gns_bet_detail.roundid
     *
     * @return the value of t_gns_bet_detail.roundid
     *
     * @mbg.generated
     */
    public String getRoundid() {
        return roundid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_gns_bet_detail.roundid
     *
     * @param roundid the value for t_gns_bet_detail.roundid
     *
     * @mbg.generated
     */
    public void setRoundid(String roundid) {
        this.roundid = roundid == null ? null : roundid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_gns_bet_detail.jp_id
     *
     * @return the value of t_gns_bet_detail.jp_id
     *
     * @mbg.generated
     */
    public String getJpId() {
        return jpId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_gns_bet_detail.jp_id
     *
     * @param jpId the value for t_gns_bet_detail.jp_id
     *
     * @mbg.generated
     */
    public void setJpId(String jpId) {
        this.jpId = jpId == null ? null : jpId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_gns_bet_detail.jpcontrib
     *
     * @return the value of t_gns_bet_detail.jpcontrib
     *
     * @mbg.generated
     */
    public String getJpcontrib() {
        return jpcontrib;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_gns_bet_detail.jpcontrib
     *
     * @param jpcontrib the value for t_gns_bet_detail.jpcontrib
     *
     * @mbg.generated
     */
    public void setJpcontrib(String jpcontrib) {
        this.jpcontrib = jpcontrib == null ? null : jpcontrib.trim();
    }
}