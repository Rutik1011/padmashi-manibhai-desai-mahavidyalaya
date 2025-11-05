import { Component, AfterViewInit, ElementRef, ViewChild, OnDestroy } from '@angular/core';
import { GeteventsService } from '../getevents.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements AfterViewInit, OnDestroy {

  @ViewChild('scrollContainer') scrollContainer!: ElementRef;
  private scrollInterval: any;

  eventsData: any[] = [];

  constructor(private geteventdata: GeteventsService) { 
   this.geteventdata.getevents().subscribe({
  next: (data) => {  // TS now knows data is any[]
    this.eventsData = data;
    console.log(data);
    this.startScroll();
  },
  error: (error) => console.log(error)
});
  }

  ngAfterViewInit(): void {
    // scrolling will start after data loaded
  }

  startScroll() {
    const container = this.scrollContainer.nativeElement;

    // Duplicate children nodes for smooth infinite scroll
    const children = Array.from(container.children) as HTMLElement[];
    children.forEach(child => {
      container.appendChild(child.cloneNode(true) as HTMLElement);
    });

    this.scrollInterval = setInterval(() => {
      container.scrollTop += 1;
      if (container.scrollTop >= container.scrollHeight / 2) {
        container.scrollTop = 0;
      }
    }, 35);
  }

  ngOnDestroy(): void {
    if (this.scrollInterval) {
      clearInterval(this.scrollInterval);
    }
  }
}
