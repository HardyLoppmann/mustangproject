/** **********************************************************************
 *
 * Copyright 2018 Jochen Staerk
 *
 * Use is subject to license terms.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy
 * of the License at http://www.apache.org/licenses/LICENSE-2.0.
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 *********************************************************************** */
package org.mustangproject.ZUGFeRD;

import java.util.Date;

public class IZUGFeRDExportableTransactionImpl implements IZUGFeRDExportableTransaction {

	private String number;
	private Date issueDate;
	private String ownOrganisationFullPlaintextInfo;
	private Date dueDate;
	private IZUGFeRDAllowanceCharge[] zFAllowances;
	private IZUGFeRDAllowanceCharge[] zFCharges;
	private IZUGFeRDAllowanceCharge[] zFLogisticsServiceCharges;
	private IZUGFeRDExportableItem[] zFItems;
	private IZUGFeRDExportableContact recipient;
	private IZUGFeRDTradeSettlementPayment[] settlementPayments;
	private String ownTaxID;
	private String ownVATID;
	private String ownOrganisationName;
	private String ownStreet;
	private String ownZIP;
	private String ownLocation;
	private String ownCountry;
	private Date deliveryDate;
	private String currency;
	private String paymentTermDescription;
	private String referenceNumber;

	@Override
	public String getNumber() {
		return number;
	}

	@Override
	public Date getIssueDate() {
		return issueDate;
	}

	@Override
	public String getOwnOrganisationFullPlaintextInfo() {
		return ownOrganisationFullPlaintextInfo;
	}

	@Override
	public Date getDueDate() {
		return dueDate;
	}

	@Override
	public IZUGFeRDAllowanceCharge[] getZFAllowances() {
		return zFAllowances;
	}

	@Override
	public IZUGFeRDAllowanceCharge[] getZFCharges() {
		return zFCharges;
	}

	@Override
	public IZUGFeRDAllowanceCharge[] getZFLogisticsServiceCharges() {
		return zFLogisticsServiceCharges;
	}

	@Override
	public IZUGFeRDExportableItem[] getZFItems() {
		return zFItems;
	}

	@Override
	public IZUGFeRDExportableContact getRecipient() {
		return recipient;
	}

	@Override
	public IZUGFeRDTradeSettlementPayment[] getTradeSettlementPayment() {
		return settlementPayments;
	}

	@Override
	public String getOwnTaxID() {
		return ownTaxID;
	}

	@Override
	public String getOwnVATID() {
		return ownVATID;
	}

	@Override
	public String getOwnOrganisationName() {
		return ownOrganisationName;
	}

	@Override
	public String getOwnStreet() {
		return ownStreet;
	}

	@Override
	public String getOwnZIP() {
		return ownZIP;
	}

	@Override
	public String getOwnLocation() {
		return ownLocation;
	}

	@Override
	public String getOwnCountry() {
		return ownCountry;
	}

	@Override
	public Date getDeliveryDate() {
		return deliveryDate;
	}

	@Override
	public String getCurrency() {
		return currency;
	}

	@Override
	public String getPaymentTermDescription() {
		return paymentTermDescription;
	}

	@Override
	public String getReferenceNumber() {
		return referenceNumber;
	}

	public IZUGFeRDExportableTransactionImpl setNumber(String number) {
		this.number = number;
		return this;
	}

	public IZUGFeRDExportableTransactionImpl setIssueDate(Date issueDate) {
		this.issueDate = issueDate;
		return this;
	}

	public IZUGFeRDExportableTransactionImpl setOwnOrganisationFullPlaintextInfo(String ownOrganisationFullPlaintextInfo) {
		this.ownOrganisationFullPlaintextInfo = ownOrganisationFullPlaintextInfo;
		return this;
	}

	public IZUGFeRDExportableTransactionImpl setDueDate(Date dueDate) {
		this.dueDate = dueDate;
		return this;
	}

	public IZUGFeRDExportableTransactionImpl setZFAllowances(IZUGFeRDAllowanceCharge... zFAllowances) {
		this.zFAllowances = zFAllowances;
		return this;
	}

	public IZUGFeRDExportableTransactionImpl setZFCharges(IZUGFeRDAllowanceCharge... zFCharges) {
		this.zFCharges = zFCharges;
		return this;
	}

	public IZUGFeRDExportableTransactionImpl setZFLogisticsServiceCharges(IZUGFeRDAllowanceCharge... zFLogisticsServiceCharges) {
		this.zFLogisticsServiceCharges = zFLogisticsServiceCharges;
		return this;
	}

	public IZUGFeRDExportableTransactionImpl setZFItems(IZUGFeRDExportableItem... zFItems) {
		this.zFItems = zFItems;
		return this;
	}

	public IZUGFeRDExportableTransactionImpl setRecipient(IZUGFeRDExportableContact recipient) {
		this.recipient = recipient;
		return this;
	}

	public IZUGFeRDExportableTransactionImpl setOwnTaxID(String ownTaxID) {
		this.ownTaxID = ownTaxID;
		return this;
	}

	public IZUGFeRDExportableTransactionImpl setOwnVATID(String ownVATID) {
		this.ownVATID = ownVATID;
		return this;
	}

	public IZUGFeRDExportableTransactionImpl setOwnOrganisationName(String ownOrganisationName) {
		this.ownOrganisationName = ownOrganisationName;
		return this;
	}

	public IZUGFeRDExportableTransactionImpl setOwnStreet(String ownStreet) {
		this.ownStreet = ownStreet;
		return this;
	}

	public IZUGFeRDExportableTransactionImpl setOwnZIP(String ownZIP) {
		this.ownZIP = ownZIP;
		return this;
	}

	public IZUGFeRDExportableTransactionImpl setOwnLocation(String ownLocation) {
		this.ownLocation = ownLocation;
		return this;
	}

	public IZUGFeRDExportableTransactionImpl setOwnCountry(String ownCountry) {
		this.ownCountry = ownCountry;
		return this;
	}

	public IZUGFeRDExportableTransactionImpl setDeliveryDate(Date deliveryDate) {
		this.deliveryDate = deliveryDate;
		return this;
	}

	public IZUGFeRDExportableTransactionImpl setCurrency(String currency) {
		this.currency = currency;
		return this;
	}

	public IZUGFeRDExportableTransactionImpl setPaymentTermDescription(String paymentTermDescription) {
		this.paymentTermDescription = paymentTermDescription;
		return this;
	}

	public IZUGFeRDExportableTransactionImpl setReferenceNumber(String referenceNumber) {
		this.referenceNumber = referenceNumber;
		return this;
	}

	public IZUGFeRDExportableTransactionImpl setTradeSettlementPayment(IZUGFeRDTradeSettlementPayment... settlementPayments) {
		this.settlementPayments = settlementPayments;
		return this;
	}
}
