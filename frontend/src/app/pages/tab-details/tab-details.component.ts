import {Component, Input, OnInit} from '@angular/core';
import {Conference} from '../../shared/interfaces/conference';

@Component({
  selector: 'app-tab-details',
  templateUrl: './tab-details.component.html',
  styleUrls: ['./tab-details.component.css']
})
export class TabDetailsComponent implements OnInit {
  @Input()
  conference: Conference;

  constructor() { }

  ngOnInit(): void {
  }

}