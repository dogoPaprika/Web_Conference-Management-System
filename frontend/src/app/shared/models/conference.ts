export interface Conference {
  id: string;
  name: string;
  website: string;
  startDate: string;
  endDate: string;
  abstractDeadline: string;
  fullPaperDeadline: string;
  biddingDeadline: string;
  evaluationDeadline: string;
  nrOfReviewers: number;
  taxFee: number;
  emails: string[];
}